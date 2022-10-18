package W03_Arrays.Exercises;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String secondArrayFirstWord : secondArray) {
            for (String firstArrayFirstWord : firstArray) {
                if(secondArrayFirstWord.equals(firstArrayFirstWord)){
                    System.out.print(firstArrayFirstWord + " ");
                }

            }

        }


    }
}
