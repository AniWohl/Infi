package at.woa;
import java.util.Scanner;

public class CaesarVerschluesselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text hier eingeben:");
        String stringToEncrypt = scanner.nextLine();

        System.out.println("Verschiebungswert hier:");
        int shift = scanner.nextInt();


        String result = encrypt(shift, stringToEncrypt);

        System.out.println("Der Cäsar Text: " + result);


        scanner.close();
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        char[] inputData = stringToEncrypt.toCharArray();
        String encryptedString = "";

        for (int i = 0; i < inputData.length; i++) {

            int letter = ((int) inputData[i]) + shift;


            if (Character.isLetter(inputData[i])) {

                if (Character.isUpperCase(inputData[i])) {

                    letter = (letter - 'A') % 26 + 'A';
                } else {

                    letter = (letter - 'a') % 26 + 'a';
                }
            }
            encryptedString += (char) letter;
        }

        return encryptedString;
    }
}
