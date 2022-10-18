package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int totalLiters = 0;

        for (int i = 1; i <= numberOfLines; i++){

            int liters = Integer.parseInt(scanner.nextLine());

            totalLiters +=liters;


            if (totalLiters > 255){

                System.out.println("Insufficient capacity!");
                totalLiters -=liters;
            }


        }

        System.out.println(totalLiters);
    }
}
