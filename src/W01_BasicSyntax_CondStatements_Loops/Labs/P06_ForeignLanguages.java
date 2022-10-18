package W01_BasicSyntax_CondStatements_Loops.Labs;

import java.util.Scanner;

public class P06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program, which prints the language, that a given country speaks.
        // You can receive only the following combinations:
        // English is spoken in England and USA; Spanish is spoken in Spain, Argentina and Mexico; for the others, we should print "unknown".

        String country = scanner.nextLine();

        if (country.equals("USA") || country.equals("England")){
            System.out.println("English");
        } else if(country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }



    }
}
