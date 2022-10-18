package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        StringBuilder input = new StringBuilder(scanner.nextLine());


        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);

            char nextChar = input.charAt(i+1);

            if(currentChar == nextChar){
                input.deleteCharAt(i+1);
                i--;
                continue;
            }






        }

        System.out.println(input);
    }

}
