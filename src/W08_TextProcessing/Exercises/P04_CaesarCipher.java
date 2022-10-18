package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = (char) (input.charAt(i) + 3);

            encryptedText.append(currentChar);

        }

        System.out.println(encryptedText);
    }
}
