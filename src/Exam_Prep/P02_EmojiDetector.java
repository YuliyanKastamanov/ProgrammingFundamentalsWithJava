package Exam_Prep;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regexCoolThreshold = "(?<coolThreshold>[0-9])";
        Pattern patternCoolThreshold = Pattern.compile(regexCoolThreshold);
        Matcher matcherCoolThreshold = patternCoolThreshold.matcher(input);
        int coolThreshold = 1;

        while (matcherCoolThreshold.find()){
            int currentNum = Integer.parseInt(matcherCoolThreshold.group(0));
            coolThreshold = coolThreshold*currentNum;
        }
        System.out.println("Cool threshold: " + coolThreshold);

        String regexEmojis = "(?<delimiter>[:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern patternEmojis = Pattern.compile(regexEmojis);
        Matcher matcherEmojis = patternEmojis.matcher(input);

        List<String> emojis = new ArrayList<>();
        int emojiCount = 0;

        while (matcherEmojis.find()){
            String currentEmoji = matcherEmojis.group("emoji");
            int emojiPoints = 0;
            emojiCount++;
            for (int i = 0; i < currentEmoji.length(); i++) {
                char currentChar = currentEmoji.charAt(i);
                emojiPoints+=currentChar;

            }
            if (emojiPoints>=coolThreshold){
                emojis.add(matcherEmojis.group());
            }


        }



        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCount);
        if (emojis.size()>0){
            for (String emoji: emojis) {
                System.out.printf("%s %n", emoji);

            }
        }
    }
}
