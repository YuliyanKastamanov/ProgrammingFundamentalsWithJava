package Exam_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class P01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder decodedMessage = new StringBuilder(encryptedMessage);

        while (!command.equals("Decode")) {


            decodedMessage = getDecodedMessage(decodedMessage, command);


            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + decodedMessage.toString());


    }

    private static StringBuilder getDecodedMessage(StringBuilder decodedMessage, String command) {

        String currentCommand = command.split("\\|")[0];
        String currentInput = decodedMessage.toString();
        switch (currentCommand) {
            case "Move":
                int count = Integer.parseInt(command.split("\\|")[1]);
                for (int i = 0; i < count; i++) {
                    char currentChar = currentInput.charAt(i);
                    decodedMessage.append(currentChar);
                    decodedMessage.deleteCharAt(0);

                }
                break;

            case"Insert":
                int index = Integer.parseInt(command.split("\\|")[1]);
                String stringToInsert = command.split("\\|")[2];
                decodedMessage.insert(index, stringToInsert);
                //decodedMessage.append(currentInput.substring(0, index));
                //decodedMessage.append(charToInsert);
                //decodedMessage.append(currentInput.substring(index));
                break;

            case "ChangeAll":
                char charToChange = command.split("\\|")[1].charAt(0);
                char newChar = command.split("\\|")[2].charAt(0);
                String newMessage = decodedMessage.toString().replace(charToChange, newChar);
                decodedMessage.setLength(0);
                decodedMessage.append(newMessage);
                break;

        }
        return decodedMessage;
    }
}

