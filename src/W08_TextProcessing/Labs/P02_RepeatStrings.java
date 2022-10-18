package W08_TextProcessing.Labs;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word: input) {

            for (int i = 0; i < word.length(); i++) {
                result.append(word);

            }

        }

        System.out.println(result);


    }
}
