package W04_Methods.Exercises;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = isValidLength(password);
        if(!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidContent(password);
        if(!isValidContent){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidDigits = isValidDigits(password);
        if(!isValidDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if(isValidLength && isValidContent && isValidDigits){
            System.out.println("Password is valid");
        }


    }

    private static boolean isValidDigits(String password) {

        int count = 0;
        for (int i = 0; i <password.length() ; i++) {
            char currentSymbol = password.charAt(i);

            if (Character.isDigit(currentSymbol)) {

                count++;
            }

        }
        return count>=2;

    }

    private static boolean isValidContent(String password) {

        for (int i = 0; i < password.length() ; i++) {
            char currentSymbol = password.charAt(i);
            if(!Character.isLetterOrDigit(currentSymbol)){
                return false;
            }

        }
        return true;


    }

    private static boolean isValidLength(String password) {
        if(password.length() >= 6 && password.length()<= 10){
            return true;
        } else {
            return false;
        }

    }

}
