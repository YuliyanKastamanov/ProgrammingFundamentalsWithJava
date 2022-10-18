package W04_Methods.Labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int givenPower = Integer.parseInt(scanner.nextLine());


        System.out.println(new DecimalFormat("0.####").format(mathPower(number, givenPower)));


    }

    private static double mathPower(double number, int givenPower) {

        double result = 1;

        result = Math.pow(number, givenPower);
        return result;
    }
}
