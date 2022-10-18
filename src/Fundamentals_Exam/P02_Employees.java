package Fundamentals_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String regex = "(?<employeeName>[A-Z][a-z]{2,} [A-Z][a-z]{2,})#+(?<position>([A-Z][A-Za-z]+(&?))([A-Z][A-Za-z]+(&?))?([A-Z][A-Za-z]+(&?))?)[0-9]{2}(?<company>[A-Z][A-Za-z]+[\\d+]* (Ltd.|JSC))";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String employeeName = matcher.group("employeeName");
                String position = matcher.group("position");
                String company = matcher.group("company");
                if(position.contains("&")){
                    position = position.replace('&', ' ');
                }
                System.out.printf("%s is %s at %s%n", employeeName, position, company);
            }


        }



    }
}
