package W01_BasicSyntax_CondStatements_Loops.Exercises;

import java.util.Scanner;

public class P06_StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumFact = 0;

        int startNumber = number;

        while (number !=0){

            int lastDigit = number % 10;

            int fact = 1;

            for (int n = 1; n <= lastDigit; n++){

                fact = fact * n;

            }

            sumFact += fact;

            number = number / 10;
        }


        if (startNumber == sumFact) {

            System.out.println("yes");

        } else {

            System.out.println("no");

        }


    }
}
