package W04_Methods.Exercises;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = getSum(firstNumber, secondNumber);

        int subtract = getSubtract(sum, thirdNumber);
        System.out.println(subtract);

    }

    private static int getSubtract(int sum, int thirdNumber) {
        int subtract = sum - thirdNumber;

        return subtract;
    }

    private static int getSum(int firstNumber, int secondNumber) {

        int sum = firstNumber + secondNumber;
        return sum;
    }

}
