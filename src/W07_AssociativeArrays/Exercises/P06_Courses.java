package W07_AssociativeArrays.Exercises;

import java.util.*;

public class P06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!command.equals("end")){
            String courseName = command.split(" : ")[0];
            String name = command.split(" : ")[1];

            if(!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(name);

            command = scanner.nextLine();
        }


        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- "+ studentName));
                });
    }
}
