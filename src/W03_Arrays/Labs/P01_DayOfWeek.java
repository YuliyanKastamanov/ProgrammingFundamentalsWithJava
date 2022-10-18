package W03_Arrays.Labs;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int currentDay = Integer.parseInt(scanner.nextLine());

        if (currentDay<1 || currentDay>7){
            System.out.println("Invalid day!");
        }else {
            System.out.println(days[currentDay-1]);
        }



    }
}
