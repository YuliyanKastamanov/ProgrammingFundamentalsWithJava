package W06_ObjectsAndClasses.Exercises.P05_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<Students> students = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String secondName = input[1];
            Double grade = Double.parseDouble(input[2]);

            Students student = new Students(firstName, secondName, grade);
            students.add(student);

        }

        students.sort(Comparator.comparing(Students::getGrade));
        Collections.reverse(students);

        for (Students student: students) {
            System.out.println(student.toString());

        }
    }
}
