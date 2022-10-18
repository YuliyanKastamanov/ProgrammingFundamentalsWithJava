package W02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (char letters1 = 'a'; letters1 < 'a' + n; letters1++){
            for (char letters2 = 'a'; letters2 < 'a' + n; letters2++){
                for (char letters3 = 'a'; letters3 < 'a' + n; letters3++){

                    System.out.printf("%c%c%c%n",letters1, letters2, letters3 );

                }
            }
        }
    }
}
