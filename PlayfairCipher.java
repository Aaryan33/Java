import java.util.Scanner;;

public class PlayfairCipher {

    private String key;
    //create matrix 
    private char[][] keyMatrix;

    //Convert key to uppercase and remove non-alphabetic characters
    public PlayfairCipher(String key) {

        this.key = key.toUpperCase().replaceAll("[^A-Z]", "");
        this.keyMatrix = generateKeyMatrix();
    }
    
    //generate 5*5 matrix
    private char[][] generateKeyMatrix() {

        char[][] matrix = new char[5][5];
        String keyWithoutDuplicates = removeDuplicatesFromKey();
        String keyAlphabet = keyWithoutDuplicates + "ABCDEFGHIKLMNOPQRSTUVWXYZ";
    
        int index = 0;
    
        for (char ch : keyAlphabet.toCharArray()) {

            if (index < 25) {  // Check if the matrix is full (25 characters).

                // Calculate the row and column positions in the matrix using integer division and remainder.
                matrix[index / 5][index % 5] = ch;
                index++;
            }
        }
    
        return matrix;
    }


    //remove duplicate from key 
    private String removeDuplicatesFromKey() {

        StringBuilder result = new StringBuilder();

        //if visited we not have to visit again 
        boolean[] visited = new boolean[26];

        //each char iterate 
        for (char ch : key.toCharArray()) {

            // we substrack ch acsii - a ascii we got numerical value that corrospond to english letter 
            int index = ch - 'A';

            //if not visited then visit 
            if (!visited[index]) {

                result.append(ch);
                visited[index] = true;
            }
        }

        return result.toString();
    }

    //plain text 
    private String preparePlainText(String plaintext) {

        //uper case 
        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder cleanedText = new StringBuilder(plaintext);

        //2-2 pair we take 
        for (int i = 0; i < cleanedText.length() - 1; i += 2) {

            //same char then add filler 
            if (cleanedText.charAt(i) == cleanedText.charAt(i + 1)) {

                cleanedText.insert(i + 1, 'X');   // Insert 'X' between repeated characters
            }
        }
        //if odd then put filler 
        if (cleanedText.length() % 2 != 0) {

            cleanedText.append('X');   // Append 'X' for odd-length text
        }

        return cleanedText.toString();
    }

    private int[] findPosition(char ch) {

        int[] pos = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (keyMatrix[i][j] == ch) {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        return pos;
    }

    private String encryptPair(char ch1, char ch2) {

        //find postion of ch1,2 in matrix 
        int[] pos1 = findPosition(ch1);
        int[] pos2 = findPosition(ch2);

        //both at same row then we have to take right of them and if the matrix ends then we have to take first col char 
        if (pos1[0] == pos2[0]) {

            return "" + keyMatrix[pos1[0]][(pos1[1] + 1) % 5] + keyMatrix[pos2[0]][(pos2[1] + 1) % 5];
            
            
        } else if (pos1[1] == pos2[1]) {   //both are in same col, we have to take downwards char and if matrix ends then first row 

            return "" + keyMatrix[(pos1[0] + 1) % 5][pos1[1]] + keyMatrix[(pos2[0] + 1) % 5][pos2[1]];
            
        } else {   

            return "" + keyMatrix[pos1[0]][pos2[1]] + keyMatrix[pos2[0]][pos1[1]];
        }
    }

    public String encrypt(String plaintext) {

        plaintext = preparePlainText(plaintext);

        StringBuilder ciphertext = new StringBuilder();

        
        for (int i = 0; i < plaintext.length(); i += 2) {

            char ch1 = plaintext.charAt(i);
            char ch2 = plaintext.charAt(i + 1);
            ciphertext.append(encryptPair(ch1, ch2));
        }

        return ciphertext.toString();
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the key: ");
        String key = scanner.nextLine();
        PlayfairCipher playfair = new PlayfairCipher(key);

        System.out.print("Enter the plain text: ");
        String plaintext = scanner.nextLine();

        String ciphertext = playfair.encrypt(plaintext);

        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);

        scanner.close();
    }
}