package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String word : usernames) {
            if(isValidWord(word)){
                System.out.println(word);
            }

        }
    }

    private static boolean isValidWord(String word) {

        if (!(word.length() >= 3 && word.length() <= 16)) {
            return false;
        }
        for (char symbol : word.toCharArray()) {
            //проверка за буква или цифра или - или _
            if(!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }
}
