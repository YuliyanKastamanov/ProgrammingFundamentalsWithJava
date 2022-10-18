package Exam_Prep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<delimiter>[#?\\|?])(?<product>[A-Z a-z]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> products = new ArrayList<>();

        int caloriesSum = 0;

       while (matcher.find()) {

           String currentProduct = matcher.group("product");
           String currentDate = matcher.group("date");
           String currentCalories = matcher.group("calories");
           products.add(String.format("Item: %s, Best before: %s, Nutrition: %s",
                   currentProduct, currentDate, currentCalories));

           caloriesSum += Integer.parseInt(currentCalories);

       }

       int actualDays = caloriesSum/2000;


        System.out.printf("You have food to last you for: %d days!%n", actualDays);
        products.forEach(System.out::println);



    }
}
