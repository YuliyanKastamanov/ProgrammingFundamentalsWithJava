package W04_Methods.Exercises;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printSequenceBetweenChars(first, second);
    }

    private static void printSequenceBetweenChars(char first, char second) {

        if (first<second){
            for (char symbol = (char) (first+1); symbol < second ; symbol++) {
                System.out.print(symbol + " ");
                
            }
        }else {

            for (char symbol = (char) (second + 1); symbol < first ; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }


}
