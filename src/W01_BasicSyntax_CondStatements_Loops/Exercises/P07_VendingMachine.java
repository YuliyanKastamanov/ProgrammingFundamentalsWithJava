package W01_BasicSyntax_CondStatements_Loops.Exercises;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumMoney = 0;

        while (!input.equals("Start")){

            double money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){

                sumMoney= sumMoney + money;
            }else {
                System.out.printf("Cannot accept %.2f%n", money);

            }



            input = scanner.nextLine();

        }

        String productType = scanner.nextLine();


        while (!productType.equals("End")){


            if ("Nuts".equals(productType)) {
                if (sumMoney >= 2.0) {
                    System.out.println("Purchased Nuts");
                    sumMoney -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Water".equals(productType)) {
                if (sumMoney >= 0.7) {
                    System.out.println("Purchased Water");
                    sumMoney -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Crisps".equals(productType)) {
                if (sumMoney >= 1.5) {
                    System.out.println("Purchased Crisps");
                    sumMoney -= 1.5;

                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Soda".equals(productType)) {
                if (sumMoney >= 0.8) {
                    System.out.println("Purchased Soda");
                    sumMoney -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if ("Coke".equals(productType)) {
                if (sumMoney >= 1.0) {
                    System.out.println("Purchased Coke");
                    sumMoney -= 1.0;
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else {
                System.out.println("Invalid product");
            }


            productType = scanner.nextLine();


        }


        System.out.printf("Change: %.2f",sumMoney);


    }
}
