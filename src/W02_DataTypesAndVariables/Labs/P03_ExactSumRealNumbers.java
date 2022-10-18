package W02_DataTypesAndVariables.Labs;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int num = 1; num<=number ; num++) {
            BigDecimal currentNumber1 = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNumber1);


            
        }



        System.out.println(sum);
    }
}
