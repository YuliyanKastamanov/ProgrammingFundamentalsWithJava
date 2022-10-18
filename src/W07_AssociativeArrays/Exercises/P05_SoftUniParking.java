package W07_AssociativeArrays.Exercises;

import java.util.*;

public class P05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, String> carParking = new LinkedHashMap<>();

        for (int i = 0; i <number ; i++) {
            String input = scanner.nextLine();

            String command = input.split("\\s+")[0];
            String username = input.split("\\s+")[1];


            if (command.equals("register")){
                String licensePlateNumber = input.split("\\s+")[2];

                if(!carParking.containsKey(username)){
                    carParking.put(username, licensePlateNumber);
                    System.out.println(username + " registered "+ licensePlateNumber+ " successfully");

                }else{
                    System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                }

            }else if(command.equals("unregister")){

                if (carParking.containsKey(username)){
                    carParking.remove(username);
                    System.out.println(username + " unregistered successfully");
                    continue;
                }else {

                    System.out.println("ERROR: user " + username+ " not found");

                }

            }

        }
        carParking.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " => " + entry.getValue()));


    }
}
