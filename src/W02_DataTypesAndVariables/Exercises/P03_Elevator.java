package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P03_Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double result = Math.ceil(people/(capacity*1.0));


        System.out.printf("%.0f", result);

    }
}
