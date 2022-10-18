package W08_TextProcessing.Labs;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {

            String newWord = "";

            for (int i = 0; i < word.length(); i++) {
                newWord += "*";


            }
            text = text.replace(word, newWord);
            
        }
        System.out.println(text);


        }

    }

