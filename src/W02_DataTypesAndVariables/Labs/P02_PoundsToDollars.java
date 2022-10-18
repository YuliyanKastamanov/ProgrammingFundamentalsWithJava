package W02_DataTypesAndVariables.Labs;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        Double result = input *1.36;



        System.out.printf("%.3f", result);
    }
}
