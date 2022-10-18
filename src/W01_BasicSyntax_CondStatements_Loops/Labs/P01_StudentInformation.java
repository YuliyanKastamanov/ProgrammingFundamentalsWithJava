package W01_BasicSyntax_CondStatements_Loops.Labs;

import java.util.Scanner;

public class P01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        //"Name: {student name}, Age: {student age}, Grade: {student grade}".

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, grade );
    }
}
