package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);



        if (Character.isUpperCase(c)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }




    }
}
