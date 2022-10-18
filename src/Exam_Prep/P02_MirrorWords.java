package Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class    P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<delimiter>[#|@])(?<fistWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int countWords = 0;

        List<String> words = new ArrayList<>();



        while (matcher.find()){
            countWords++;
            StringBuilder firstWord = new StringBuilder(matcher.group("fistWord"));
            String secondWord = matcher.group("secondWord");
            String reversedFirstWord = firstWord.reverse().toString();
            firstWord.reverse();

            if(reversedFirstWord.equals(secondWord)){
                firstWord.append(" <=> " + secondWord);
                words.add(firstWord.toString());
            }

        }


        if(countWords <= 0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");

        }else {
            if(words.size() == 0){
                System.out.printf("%d word pairs found!%n", countWords);
                System.out.println("No mirror words!");
            }else {
                System.out.printf("%d word pairs found!%n", countWords);

                for (int i = 0; i < words.size(); i++) {
                    if (i == 0){
                        System.out.println("The mirror words are:");
                        System.out.printf("%s", words.get(i));
                    }else {
                        System.out.printf(", %s", words.get(i));
                    }


                }
            }
        }
    }
}
