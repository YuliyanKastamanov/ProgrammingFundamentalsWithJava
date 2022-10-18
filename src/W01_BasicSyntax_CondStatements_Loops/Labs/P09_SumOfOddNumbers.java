package W01_BasicSyntax_CondStatements_Loops.Labs;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int oddNumbers = 2 * i - 1;
            System.out.println(oddNumbers);

            sum += oddNumbers;
        }
        System.out.printf("Sum: %d", sum);
    }
}
