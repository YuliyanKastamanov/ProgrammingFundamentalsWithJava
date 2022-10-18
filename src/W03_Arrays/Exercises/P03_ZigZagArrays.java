package W03_Arrays.Exercises;

import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[count];
        int[] secondArray = new int[count];

        for (int row = 0; row <count; row++) {
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if((row+1) % 2 == 0){
                firstArray[row] = secondNumber;
                secondArray[row] = firstNumber;
            }else {
                firstArray[row]= firstNumber;
                secondArray[row]= secondNumber;
            }

        }

        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
