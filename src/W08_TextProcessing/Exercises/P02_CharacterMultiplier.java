package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstString = input[0];
        String secondString = input[1];

        int shortLength =  Math.min(firstString.length(), secondString.length());
        int longLength = Math.max(firstString.length(), secondString.length());
        int sum = 0;

        for (int i = 0; i < shortLength; i++) {
            char currentCharFirstString = firstString.charAt(i);
            char currentCharSecondString = secondString.charAt(i);
            int multiplier = (int) currentCharFirstString * (int) currentCharSecondString;
            sum += multiplier;

        }

        for (int i = shortLength; i < longLength; i++) {
            if(firstString.length()>secondString.length()){
                char currentCharFirstString = firstString.charAt(i);
                int multiplier = (int) currentCharFirstString;
                sum+=multiplier;
            }else {
                char currentCharFirstString = secondString.charAt(i);
                int multiplier = (int) currentCharFirstString;
                sum+=multiplier;
            }

        }
        System.out.println(sum);

    }
}
