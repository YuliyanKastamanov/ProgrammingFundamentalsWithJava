package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number!=0){

            int lastDigit = number % 10;
            number = number / 10;
            sum += lastDigit;


        }




        System.out.println(sum);


    }
}
