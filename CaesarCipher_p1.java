import java.util.Scanner;

public class CaesarCipher_p1 {

    // Function to perform Caesar Cipher encryption
    public static String caesarCipher(String text, int shift) {

        StringBuilder result = new StringBuilder();

        // Loop through each character in the text
        for (char ch : text.toCharArray()) {

            if (Character.isLetter(ch)) {

                char base = Character.isLowerCase(ch) ? 'a' : 'A';  // Determine base character for case
                ch = (char) ((ch - base + shift) % 26 + base);      // Perform cipher shift
            }
            
            result.append(ch);    // Append encrypted character to result
        }

        return result.toString();
    }

    // Function to perform Caesar Cipher decryption
    public static String caesarDecipher(String text, int shift) {

        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isLetter(ch)) {

                char base = Character.isLowerCase(ch) ? 'a' : 'A';   // Determine base character for case
                ch = (char) ((ch - base - shift + 26) % 26 + base);  // Perform decipher shift
            }

            result.append(ch);   // Append decrypted character to result
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shiftValue;
        System.out.println("Enter the key");
        shiftValue = scanner.nextInt();

        while (true) {
            System.out.println("Enter 1 if you are a sender");
            int c = scanner.nextInt();

            if (c == 1) {
                System.out.println("Enter the string which is to be converted to cipher text");
                scanner.nextLine(); 
                String s = scanner.nextLine();

                String cipherText = caesarCipher(s, shiftValue);
                System.out.println("Cipher Text: " + cipherText);
                break;
            } else if (c == 2) {
                System.out.println("Enter the cipher text to be converted to plain text");
                scanner.nextLine(); 
                String cipher = scanner.nextLine();

                String decryptedText = caesarDecipher(cipher, shiftValue);
                System.out.println("Decrypted Text: " + decryptedText);
                break;
            }
        }

        scanner.close();
    }
}
