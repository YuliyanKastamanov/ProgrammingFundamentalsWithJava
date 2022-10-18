package W08_TextProcessing.Exercises;

import java.util.Scanner;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder bigNumber = new StringBuilder(scanner.nextLine().replaceFirst("^0+(?!$)", ""));
        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int remainder = 0;
        int numberToAdd = 0;

        for (int i = bigNumber.length() -1; i >=0 ; i--) {

            if(number==0){
                System.out.println(0);
                return;
            }
            int currentResult = (Integer.parseInt(String.valueOf(bigNumber.charAt(i))) * number) + remainder;

            if(i == 0){
                numberToAdd = currentResult % 10;

                remainder = currentResult / 10;
                result.append(numberToAdd);
                if(remainder>0){
                    result.append(remainder);
                }
                break;
            }
            if(currentResult >9){
              numberToAdd = currentResult % 10;
              remainder = currentResult / 10;
              result.append(numberToAdd);
            }else {
              result.append(currentResult);
              remainder = 0;
            }
        }
        System.out.println(result.reverse());

    }
}
