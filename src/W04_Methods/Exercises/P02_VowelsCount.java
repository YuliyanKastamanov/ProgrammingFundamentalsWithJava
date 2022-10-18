package W04_Methods.Exercises;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String vowels = getVowels(input);
        System.out.println(vowels.length());
    }

    private static String getVowels(String input) {

        String countVowels = "";

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            switch (currentSymbol) {
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                case 89:
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                case 127:
                    countVowels += currentSymbol;
                    break;
            }

        }
        return countVowels;


    }
}
