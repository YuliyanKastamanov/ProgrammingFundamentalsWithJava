package W04_Methods.Labs;

import java.util.Scanner;

public class P03_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printPyramid(number);

    }

    private static void printPyramid(int number) {
        printTopHalf(number);
        printBottomHalf(number);
    }


    private static void printTopHalf(int number) {
        for (int i = 1; i < number; i++) {
            printSingleLine(i);
        }
    }

    private static void printBottomHalf(int number) {

        for (int i = number; i >= 1; i--) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {

        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }



}
