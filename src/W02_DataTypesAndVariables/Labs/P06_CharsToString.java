package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();

        System.out.printf("%s%s%s", firstInput,secondInput, thirdInput);
    }
}
