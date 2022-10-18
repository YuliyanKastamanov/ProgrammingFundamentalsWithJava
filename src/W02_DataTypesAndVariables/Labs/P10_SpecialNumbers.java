package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <=number; num++) {

            int sumOfDigits = 0;
            int digits = num;

            while (digits>0){
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11 ){
                System.out.println(num + " -> True");
            }else {
                System.out.println(num + " -> False");
            }
        }


    }
}
