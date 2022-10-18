package Fundamentals_Exam;

import java.util.Scanner;

public class P01_Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Registration")){
            String currentCommand = command.split("\\s+")[0];

            switch (currentCommand){
                case "Letters":
                    String upperOrLower = command.split("\\s+")[1];
                    if (upperOrLower.equals("Upper")){
                        username = username.toUpperCase();
                        System.out.println(username);
                    }else if (upperOrLower.equals("Lower")){
                        username = username.toLowerCase();
                        System.out.println(username);
                    }


                    break;

                case "Reverse":
                    int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int endIndex = Integer.parseInt(command.split("\\s+")[2]) + 1;

                    if (startIndex  >= 0 && startIndex< username.length() && endIndex>=0 && endIndex<username.length()){
                        StringBuilder reversedSubstring = new StringBuilder(username.substring(startIndex, endIndex)).reverse();
                        System.out.println(reversedSubstring.toString());
                    }
                    break;

                case "Substring":
                    String substring = command.split("\\s+")[1];
                    if(username.contains(substring)){
                        username =  username.replace(substring, "");
                        System.out.println(username);
                    }else {
                        System.out.printf("The username %s doesn't contain %s.%n", username, substring);
                    }
                    break;

                case "Replace":
                    char charToReplace = command.split("\\s+")[1].charAt(0);
                    username = username.replace(charToReplace, '-');
                    System.out.println(username);

                    break;

                case "IsValid":
                    String currentChar = command.split("\\s+")[1];
                    if(username.contains(currentChar)){
                        System.out.println("Valid username.");
                    }else {
                        System.out.println(currentChar +  " must be contained in your username.");
                    }
                    break;



            }




            command = scanner.nextLine();
        }

    }
}
