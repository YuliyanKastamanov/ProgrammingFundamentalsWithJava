package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double result = meters*1.0/1000;

        System.out.printf("%.2f",result);
    }
}
