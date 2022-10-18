package W04_Methods.Labs;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //"add",  "multiply", "subtract", "divide"

        switch (action) {
            case "add":
                actionAdd(firstNumber, secondNumber);
                break;
            case "multiply":
                actionMultiply(firstNumber, secondNumber);
                break;

            case "subtract":
                actionSubtract(firstNumber, secondNumber);
                break;

            case "divide":
                actionDivide(firstNumber, secondNumber);
        }

    }

    private static void actionAdd(int a, int b) {
        System.out.println(a+b);
    }

    private static void actionMultiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void actionSubtract(int a, int b) {
        System.out.println(a-b);
    }

    private static void actionDivide(int a, int b) {
        System.out.println(a/b);
    }
}
