package W04_Methods.Exercises;

import java.util.Scanner;

public class P07_NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printNxnMatrix (number);
    }

    private static void printNxnMatrix(int number) {

        for (int i = 1; i <=number ; i++) {
            String singleLine = "";
            for (int j = 1; j <=number ; j++) {
                singleLine = singleLine + number +" ";


            }
            System.out.println(singleLine);

        }
    }
}
