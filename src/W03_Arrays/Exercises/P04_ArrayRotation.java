package W03_Arrays.Exercises;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <=countRotation ; rotation++) {

            String firstElement = numbers[0];

            for (int index = 0; index < numbers.length - 1 ; index++) {

                numbers[index] = numbers[index + 1];
                
            }
            numbers [numbers.length - 1] = firstElement;


        }

        System.out.println(String.join(" ", numbers));


    }
}
