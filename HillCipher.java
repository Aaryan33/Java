import java.util.*;

public class HillCipher {
   
    public static String encryption(String plaintext, int[][] key) {

        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += 2) {     // Take the plaintext in blocks of 2 letters
            int[] block = new int[2];

            block[0] = plaintext.charAt(i) - 'A';             // Convert the block to a 2-element vector
            block[1] = (i + 1 < plaintext.length()) ? plaintext.charAt(i + 1) - 'A' : 0;

            int[] result = multiply(key, block);

            ciphertext.append((char) (result[0] + 'A'));

            if (i + 1 < plaintext.length()) {
                ciphertext.append((char) (result[1] + 'A'));
            }
        }

        return ciphertext.toString();
    }

    public static String decryption(String ciphertext, int[][] key) {

        StringBuilder plaintext = new StringBuilder();

        int[][] inverse = inverse(key);

        for (int i = 0; i < ciphertext.length(); i += 2) {

            int[] block = new int[2];

            block[0] = ciphertext.charAt(i) - 'A';           // Convert the block to a 2-element vector
            if (i + 1 < ciphertext.length()){

                block[1] = ciphertext.charAt(i + 1) - 'A';

            } 
            else{
                block[1] = 0;
            }


            int[] result = multiply(inverse, block);

            plaintext.append((char) ((result[0] + 26) % 26 + 'A'));

            if (i + 1 < ciphertext.length()) {
                plaintext.append((char) ((result[1] + 26) % 26 + 'A'));
            }
        }

        return plaintext.toString();
    }

    public static int[] multiply(int[][] matrix, int[] vector){

        int[] result = new int[2];

        result[0] = (matrix[0][0] * vector[0] + matrix[0][1] * vector[1]) % 26;
        result[1] = (matrix[1][0] * vector[0] + matrix[1][1] * vector[1]) % 26;
        return result;
    }

    public static int determinant(int[][] matrix){      // Calculate the determinant of a 2x2 matrix
        return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0] + 26) % 26;
    }

    public static int[][] inverse(int[][] matrix){
        
        int det = determinant(matrix);                  // Calculate the determinant of the provided matrix

        for (int i = 1; i < 26; i++) {

            if ((det * i) % 26 == 1) {                  // Multiplicative inverse of the determinant modulo 26

                int detInv = i;
                int[][] inverse = new int[2][2];

                inverse[0][0] = (matrix[1][1] * detInv) % 26;
                inverse[0][1] = (-matrix[0][1] * detInv) % 26;
                inverse[1][0] = (-matrix[1][0] * detInv) % 26;
                inverse[1][1] = (matrix[0][0] * detInv) % 26;

                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (inverse[j][k] < 0) {
                            inverse[j][k] += 26;
                        }
                    }
                }

                return inverse;
            }
        }

        throw new IllegalArgumentException("Inverse does not exist");    // If no multiplicative inverse is found, throw an exception
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plaintext = sc.nextLine();

        System.out.print("Enter the key matrix (in row-major order): ");

        int[][] key = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                key[i][j] = sc.nextInt();
            }
        }

        sc.close();

        String ciphertext = encryption(plaintext, key);
        System.out.println("Ciphertext: " + ciphertext);

        String decryptedText = decryption(ciphertext, key);
        System.out.println("Decrypted text: " + decryptedText);
    }
}