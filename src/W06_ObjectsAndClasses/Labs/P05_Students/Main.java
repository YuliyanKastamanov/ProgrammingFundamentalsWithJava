package W06_ObjectsAndClasses.Labs.P05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<StudentsLabs> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");

            String firstName = tokens[0];
            String secondName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            StudentsLabs student = new StudentsLabs(firstName, secondName, age, city);

            students.add(student);

            input = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();

        for (StudentsLabs student : students) {
            if (student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
            
        }
    }
}
