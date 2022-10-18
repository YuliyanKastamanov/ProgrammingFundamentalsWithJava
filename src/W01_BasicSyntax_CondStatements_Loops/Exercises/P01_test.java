package W01_BasicSyntax_CondStatements_Loops.Exercises;

import java.util.Scanner;

public class P01_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "nut":
                System.out.println("Nut");
                break;

            case "":
                System.out.println("Invalid product");
                break;

        }


    }
}
