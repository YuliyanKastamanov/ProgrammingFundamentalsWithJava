package W06_ObjectsAndClasses.Exercises.P03_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            String name = command[0];
            int age = Integer.parseInt(command[1]);

            Person person = new Person(name, age);

            if(person.getAge()>30){
                people.add(person);
            }




        }
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person.toString());

        }

    }
}
