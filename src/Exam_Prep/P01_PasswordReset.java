package Exam_Prep;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Done")){
            String currentCommand = command[0];
            switch (currentCommand){
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < input.length(); i+=2) {
                        newPassword.append(input.charAt(i));
                    }
                    input = newPassword.toString();
                    System.out.println(input);
                    break;

                case"Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]) + startIndex;
                    input = new StringBuilder(input).delete(startIndex, endIndex).toString();
                    System.out.println(input);

                    break;

                case "Substitute":
                    String substring = command[1];
                    String substitute = command[2];

                    if(input.contains(substring)){

                        input = input.replace(substring, substitute);
                        System.out.println(input);

                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }



            command = scanner.nextLine().split("\\s+");
        }


        System.out.println("Your password is: " + input);
    }
}
