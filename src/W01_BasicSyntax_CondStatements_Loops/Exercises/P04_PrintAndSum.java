package W01_BasicSyntax_CondStatements_Loops.Exercises;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sumNumber = 0;

        for (int number = startNumber; number <= endNumber ; number++) {

            System.out.print(number + " ");

            sumNumber+=number;

        }
        System.out.println();

        System.out.println("Sum: " + sumNumber);
    }
}
