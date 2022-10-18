package W09_RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]+)!(?<count>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0;

        List<String> furniture = new ArrayList<>();
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String currentFurniture = matcher.group("furniture");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int currentCount = Integer.parseInt(matcher.group("count"));
                furniture.add(currentFurniture);
                totalSum += currentCount * currentPrice;

            }


            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.stream().forEach(n1 -> System.out.println(n1));
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
