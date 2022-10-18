package W04_Methods.Labs;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String repeatString = getRepeatString(input, count);

        System.out.println(repeatString);
    }

    private static String getRepeatString(String input, int count) {

        String result = "";
        for (int i = 0; i < count; i++) {
            result+= input;
        }
        return result;
    }
}
