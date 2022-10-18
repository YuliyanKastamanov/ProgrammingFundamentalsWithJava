package Exam_Prep;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();


        while (!command.equals("Generate")){
            String[] tokens = command.split(">>>");
            String currentCommand = tokens[0];

            switch (currentCommand){
                case "Contains":
                    String substring = tokens[1];
                    if(activationKey.contains(substring)){
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String stringToChange = new StringBuilder(activationKey).substring(startIndex, endIndex);
                    if(upperOrLower.equals("Upper")){
                        activationKey = activationKey.replace(stringToChange, stringToChange.toUpperCase());
                        System.out.println(activationKey);
                    } else if(upperOrLower.equals("Lower")){
                        activationKey = activationKey.replace(stringToChange, stringToChange.toLowerCase());
                        System.out.println(activationKey);
                    }
                    break;

                case "Slice":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int lastIndex = Integer.parseInt(tokens[2]);
                    activationKey = new StringBuilder(activationKey).replace(firstIndex , lastIndex, "").toString();
                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();


        }

        System.out.println("Your activation key is: " + activationKey);







    }
}
