package W04_Methods.Exercises;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int smallestNumber = getSmallestNumber(number1, number2, number3);

        System.out.println(smallestNumber);
    }

    private static int getSmallestNumber(int number1, int number2, int number3) {

        int number = 0;
        if (number1<number2 && number1<number3){
            number = number1;
        }else if(number2<number1 && number2<number3){
            number = number2;
        } else {
            number = number3;
        }
        return number;
    }

}
