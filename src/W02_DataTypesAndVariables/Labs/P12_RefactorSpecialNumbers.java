package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Scanner scanner = new Scanner(System.in);
       //int kolkko = Integer.parseInt(scanner.nextLine());
       //int obshto = 0;
       //int takova = 0;
       //boolean toe = false;
       //for (int ch = 1; ch &lt;= kolkko; ch++) {
       //    takova = ch;
       //    while (ch &gt; 0) {

        //    obshto += ch % 10;
        //    ch = ch / 10;
        //}
        //toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
        //    System.out.printf(&quot;%d -&gt; %b%n&quot;, takova, toe);
        //obshto = 0;
        //ch = takova;

        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= input ; i++) {

           int digit = i;

           while (digit>0){
               sum+=digit %10;
               digit = digit / 10;

           }
           boolean isSpecialNumber = (sum==5 || sum==7 || sum==11);


           if (isSpecialNumber){
               System.out.printf("%d -> True%n", i);

           }else {
               System.out.printf("%d -> False%n", i);

           }


            
        }


    }
}
