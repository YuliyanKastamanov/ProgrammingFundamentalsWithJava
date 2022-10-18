package W04_Methods.Exercises;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        currentNum(number);
        
    }

    private static void currentNum(int number) {

        int currentNum = 0;
        for (int i = 0; i <= number; i++) {
            currentNum = i;

            boolean isOdd = getOdd(currentNum);
            boolean isDividable = getDividable(currentNum);

            if(isOdd && isDividable){
                System.out.println(currentNum);
            }

        }
    }

    private static boolean getDividable(int currentNum) {

        boolean isValid = false;

        int sum = 0;
        while (currentNum>0){

            sum+=currentNum%10;
            currentNum = currentNum / 10;
        }
        if(sum % 8 == 0){
            isValid = true;
        }
        return isValid;
        }



    private static boolean getOdd(int currentNum) {

        boolean isValid = false;
        while (currentNum>0){
            int digit = currentNum % 10;

            if(digit % 2 != 0){
                isValid = true;
            }

            currentNum = currentNum / 10;
        }
        return isValid;

    }
}
