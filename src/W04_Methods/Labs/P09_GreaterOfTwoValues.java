package W04_Methods.Labs;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();

        if (valueType.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int getMax = getMaxValue(firstNum, secondNum);
            System.out.println(getMax);
        } else if (valueType.equals("char")){
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            char getMax = getMaxValue(firstChar, secondChar);
            System.out.println(getMax);
        } else if(valueType.equals("string")){
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            String getMax = getMaxValue(firstString, secondString);
            System.out.println(getMax);
        }


    }

    private static int getMaxValue(int firstNum, int secondNum) {
        if (firstNum>secondNum){
            return firstNum;
        }
        return secondNum;
    }

    private static char getMaxValue(char firstChar, char secondChar) {
        if (firstChar>secondChar){
            return firstChar;
        }
        return secondChar;
    }

    private static String getMaxValue (String firstString, String secondString){
        if(firstString.compareTo(secondString)>=0){
            return firstString;
        }
        return secondString;
    }

}
