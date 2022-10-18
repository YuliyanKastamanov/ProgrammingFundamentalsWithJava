package W02_DataTypesAndVariables.Labs;

import java.math.BigDecimal;
import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    String townName = scanner.nextLine();
    BigDecimal population = new BigDecimal(scanner.nextLine());
    double area = Double.parseDouble(scanner.nextLine());


        System.out.printf("Town %s has population of %.0f and area %.0f square km.", townName, population, area);

    }


}
