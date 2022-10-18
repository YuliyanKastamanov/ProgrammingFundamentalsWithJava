package W04_Methods.Exercises;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(String number) {

        String reversedNumber = gerReversedNumber(number);

        if (number.equals(reversedNumber)) {

            return true;
        }else {
            return false;
        }
    }

    private static String gerReversedNumber(String number) {

        String reversedNumber = "";

        for (int i = number.length()-1; i >= 0 ; i--) {
            char currentElement = number.charAt(i);

            reversedNumber += currentElement;

        }
        return reversedNumber;
    }
}
