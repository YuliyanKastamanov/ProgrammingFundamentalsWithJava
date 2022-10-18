package W08_TextProcessing.Labs;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();

        String input = scanner.nextLine();

        while (input.contains(stringToRemove)){



            //input = input.replaceAll(stringToRemove, "");
            input = removeOccurrences (input, stringToRemove);
            }

        System.out.println(input);
        }

    private static String removeOccurrences(String text, String stringToRemove) {
        int startIndex = text.indexOf(stringToRemove);
        int endIndex = stringToRemove.length() + startIndex;

        String firstPart = text.substring(0, startIndex);
        String secondPart = text.substring(endIndex);
        return firstPart + secondPart;
    }


}

