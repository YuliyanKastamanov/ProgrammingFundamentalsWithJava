package W05_Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int passengersCapacity = Integer.parseInt(scanner.nextLine());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")){
            if (command.get(0).equals("Add")){
                int passToAdd = Integer.parseInt(command.get(1));
                wagons.add(passToAdd);
            } else {
                int passengers = Integer.parseInt(command.get(0));
                for (int i = 0; i < wagons.size(); i++) {
                    int exactPass = passengers+wagons.get(i);

                    if(exactPass <= passengersCapacity){
                        wagons.add(i, exactPass);
                        wagons.remove(i+1);
                        break;
                    }

                }
            }


            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
