package Exam_Prep;

import java.util.Scanner;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")){
            String currentCommand = command.split(":\\|:")[0];

            switch (currentCommand){
                case "InsertSpace":
                    int index = Integer.parseInt(command.split(":\\|:")[1]);
                    concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage.toString());

                    break;

                case "Reverse":
                    StringBuilder subString = new StringBuilder(command.split(":\\|:")[1]);
                    if(!concealedMessage.toString().contains(subString)){
                        System.out.println("error");
                    } else {
                        int firstIndex = concealedMessage.indexOf(subString.toString());
                        int lastIndex = firstIndex + subString.length();
                        String reversedString = subString.reverse().toString();
                        concealedMessage.delete(firstIndex, lastIndex);
                        concealedMessage.append(reversedString);
                        System.out.println(concealedMessage.toString());


                    }


                    break;

                case "ChangeAll":
                    String substringToReplace = command.split(":\\|:")[1];
                    String replacement = command.split(":\\|:")[2];

                    while (concealedMessage.toString().contains(substringToReplace)){
                        int firstIndex = concealedMessage.indexOf(substringToReplace);
                        int lastIndex = firstIndex + substringToReplace.length();
                        concealedMessage.replace(firstIndex, lastIndex, replacement);

                    }
                    System.out.println(concealedMessage.toString());

                    break;
            }




            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + concealedMessage.toString());

    }
}
