package W04_Methods.Labs;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        double calculation = getCalculation (number1, operator, number2);

        System.out.printf("%.0f", calculation);
    }
        /// * + -
    private static double getCalculation(int number1, String operator, int number2) {
        double result = 0.0;

        switch (operator){

            case "/":
                result = number1 / number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;
        }
        return result;
    }

}
