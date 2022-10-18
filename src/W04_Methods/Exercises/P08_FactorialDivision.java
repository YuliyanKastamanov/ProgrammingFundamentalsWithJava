package W04_Methods.Exercises;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = getResult(number1, number2);

        System.out.printf("%.2f",result);
    }

    private static double getResult(int number1, int number2) {

        double number1Factorial = getNumber1Factorial(number1);
        double number2Factorial = getNumber2Factorial(number2);

        return number1Factorial/number2Factorial;


    }

    private static double getNumber2Factorial(int number2) {

        double resultNumber2 = 1;

        for (int i = 1; i <=number2 ; i++) {

            resultNumber2 = resultNumber2*i;


        }

        return resultNumber2;
    }

    private static double getNumber1Factorial(int number1) {
        double resultNumber1 = 1;

        for (int i = 1; i <=number1 ; i++) {

            resultNumber1 = resultNumber1*i;


        }

        return resultNumber1;

    }
}
