package W07_AssociativeArrays.Exercises;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> users = new TreeMap<>();


        while (!input.equals("End")){
            String[] tokens = input.split("\\s+->\\s+");

            String companyName = tokens[0];
            String companyID = tokens[1];

            if (!users.containsKey(companyName)){

                users.put(companyName, new ArrayList<>());
            }
            if (!users.get(companyName).contains(companyID)) {
                users.get(companyName).add(companyID);
            }


            input = scanner.nextLine();
        }

        users.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("-- " + entry.getValue().get(i));
                    }

                });
    }
}
