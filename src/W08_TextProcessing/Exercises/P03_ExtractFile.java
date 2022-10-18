package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String[] file = input[input.length - 1].split("\\.");

        String fileName = file[0];
        String fileType = file[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileType);
    }
}
