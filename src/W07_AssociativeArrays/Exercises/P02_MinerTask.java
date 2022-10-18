package W07_AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        LinkedHashMap<String, Integer> resource = new LinkedHashMap<>();
        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resource.containsKey(input)){
                resource.put(input, quantity);
            } else {
                int currentResource = resource.get(input);
                currentResource+=quantity;
                resource.put(input, currentResource);
            }

            input = scanner.nextLine();

        }

        //result.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        resource.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
