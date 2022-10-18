package W04_Methods.Labs;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());


        //•	2.00 – 2.99 - "Fail"
        //•	3.00 – 3.49 - "Poor"
        //•	3.50 – 4.49 - "Good"
        //•	4.50 – 5.49 - "Very good"
        //•	5.50 – 6.00 - "Excellent"

        printGrade(grade);




    }

    private static void printGrade(double grade) {
        if (grade>=2 && grade<=2.99){
            System.out.println("Fail");
        } else if(grade>=3 && grade<=3.99){
            System.out.println("Poor");
        } else if(grade>=3.50 && grade<=4.49){
            System.out.println("Good");
        }else if(grade>=4.50 && grade<=5.49){
            System.out.println("Very good");
        }else if(grade>=5.50 && grade<=6){
            System.out.println("Excellent");
        }
    }
}
