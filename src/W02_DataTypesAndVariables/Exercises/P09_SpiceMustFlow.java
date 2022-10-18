package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYielt = Integer.parseInt(scanner.nextLine());

        int countDays = 0;

        int totalAmount = 0;


        while (startingYielt >= 100) {

            int currentAmount = startingYielt - 26;

            totalAmount += currentAmount;
            startingYielt -= 10;
            countDays++;

        }
        System.out.println(countDays);

        if (totalAmount >= 26) {
            System.out.println(totalAmount - 26);

        } else {
            System.out.println(totalAmount);
        }
    }
}
