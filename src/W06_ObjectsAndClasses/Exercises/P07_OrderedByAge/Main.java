package W06_ObjectsAndClasses.Exercises.P07_OrderedByAge;

import W06_ObjectsAndClasses.Exercises.P07_OrderedByAge.SecondPerson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<SecondPerson> people = new ArrayList<>();
        while (true) {
            String personalData = scanner.nextLine();
            if (personalData.equals("End")) {
                break;
            }
            String[] splitData = personalData.split("\\s+");
            String name = splitData[0];
            String id = splitData[1];
            int age = Integer.parseInt(splitData[2]);
            SecondPerson person = new SecondPerson(name, id, age);
            people.add(person);



        }

        people.sort(Comparator.comparing(SecondPerson::getAge));

        for (SecondPerson person : people) {
            System.out.println(person.toString());
        }
    }
}
