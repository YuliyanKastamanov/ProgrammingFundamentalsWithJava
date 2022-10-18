package W07_AssociativeArrays.Exercises;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Double> students = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!students.containsKey(name)){
                students.put(name, grade);
            }else {
                double currentGrade = students.get(name);
                currentGrade=(grade + currentGrade)/2;
                students.put(name, currentGrade);
            }

        }

        students.entrySet().stream()
                .filter(entry -> entry.getValue() >= 4.50)
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue())).
                forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
