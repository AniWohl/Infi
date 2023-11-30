package at.woa;
import java.util.Scanner;

public class CaesarVerschluesselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text:");
        String text = scanner.nextLine();

        System.out.println("Zahl (1-26):");
        int shift = scanner.nextInt();

        if (shift < 1 || shift > 26) {
            System.out.println("Nein, Nein, Nein, back to square one.");
            shift = 1;
        }

        String StringResult = StringResult (text, shift);

        System.out.println("Verschlüsselter Text: " + StringResult);

        scanner.close();
    }

    public static String StringResult(String text, int shift) {
        StringBuilder StringResult = new StringBuilder();

        for (char zeichen : text.toCharArray()) {
            if (Character.isLetter(zeichen)) {
                char basis = Character.isUpperCase(zeichen) ? 'A' : 'a';
                char verschluesselt = (char) (basis + (zeichen - basis + shift) % 26);
                StringResult.append(verschluesselt);
            } else {
                StringResult.append(zeichen);
            }
        }

        return StringResult.toString();
    }
}
