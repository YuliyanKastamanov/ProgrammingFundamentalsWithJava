package W04_Methods.Labs;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //: coffee, water, coke, snacks;

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00


        switch (product){
            case "coffee":
                priceCoffee(quantity);
                break;

            case "water" :
                priceWater(quantity);
                break;
            case "coke" :
                priceCoke(quantity);
                break;
            case "snacks" :
                priceSnacks(quantity);
                break;

        }

    }

    private static void priceSnacks(int quantity) {
        double finalPrice = quantity * 2.00;
        System.out.printf("%.2f", finalPrice);
    }

    private static void priceCoke(int quantity) {
        double finalPrice = quantity * 1.40;
        System.out.printf("%.2f", finalPrice);
    }

    private static void priceWater(int quantity) {
        double finalPrice = quantity * 1.00;
        System.out.printf("%.2f", finalPrice);
    }

    private static void priceCoffee(int quantity) {
        double finalPrice = quantity * 1.50;
        System.out.printf("%.2f", finalPrice);
    }
}
