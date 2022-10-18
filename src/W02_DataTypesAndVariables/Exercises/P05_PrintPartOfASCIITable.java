package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        for (int code =number1 ; code <= number2; code++){

            System.out.print((char)code + " ");

        }

    }

}
