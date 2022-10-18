package W03_Arrays.Exercises;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagon = Integer.parseInt(scanner.nextLine());

        int [] array = new int[countWagon];

        int sum = 0;
        for (int index = 0; index <countWagon ; index++) {
            array[index] = Integer.parseInt(scanner.nextLine());
            System.out.print(" " + array[index]);
            sum+=array[index];

        }
        System.out.println();
        System.out.println(sum);
    }
}
