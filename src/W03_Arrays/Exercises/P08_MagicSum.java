package W03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicDigit = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];

            for (int j = i+1; j < array.length; j++) {
                int secondNum = array[j];
                int currentSum = firstNum + secondNum;
                if (currentSum == magicDigit){
                    System.out.println(array[i] + " " + array[j]);
                }
            }



        }


    }
}
