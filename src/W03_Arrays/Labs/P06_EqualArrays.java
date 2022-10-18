package W03_Arrays.Labs;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArrea = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArrea = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        boolean areIdentical = true;
        for (int i = 0; i <firstArrea.length ; i++) {

            sum += firstArrea[i];

            if ( firstArrea[i] != secondArrea[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
            
        }
        if (areIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
