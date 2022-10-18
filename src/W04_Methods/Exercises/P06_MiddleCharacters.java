package W04_Methods.Exercises;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            printMiddleCharacter(input);

    }

    private static void printMiddleCharacter(String input) {

        if (input.length() % 2 != 0){
            int indexMiddleCharacter = input.length() / 2;
            System.out.println(input.charAt(indexMiddleCharacter));
        }else {
            int indexFirstMidChar = (input.length()/ 2) - 1;
            int indexSecondMidChar = input.length()/ 2;
            System.out.printf("%c%c",input.charAt(indexFirstMidChar), input.charAt(indexSecondMidChar));
        }
    }
}
