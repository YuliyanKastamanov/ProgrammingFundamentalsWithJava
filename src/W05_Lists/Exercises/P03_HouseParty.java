package W05_Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < countCommands; i++) {
            List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if (command.size() == 3){
                boolean isExisting = false;
                for (int j = 0; j < guests.size(); j++) {

                    if (command.get(0).equals(guests.get(j))){
                        System.out.println(command.get(0) + " is already in the list!");
                        isExisting = true;
                        break;
                    }
                }
                if(!isExisting) {
                    guests.add(command.get(0));
                }

            }else if(command.size() == 4){
                boolean isRemoved = false;
                for (int j = 0; j < guests.size(); j++) {
                    if(command.get(0).equals(guests.get(j))){
                        guests.remove(j);
                        isRemoved = true;
                        break;
                    }

                }
                if(!isRemoved) {
                    System.out.println(command.get(0) + " is not in the list!");
                }

            }

            }
        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));

        }

        }
    }

