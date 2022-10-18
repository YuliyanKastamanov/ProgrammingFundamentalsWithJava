package Exam_Prep;

import java.util.Scanner;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder worldTour = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Travel")){
            String currentCommand = command.split(":")[0];
            switch (currentCommand){
                case "Add Stop":
                    int index = Integer.parseInt(command.split(":")[1]);
                    String destinationToAdd = command.split(":")[2];

                    if(index>=0 && index<worldTour.toString().length()) {
                        worldTour.insert(index, destinationToAdd);

                    }
                    System.out.println(worldTour.toString());
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2])+1;
                    if(startIndex>=0 && endIndex<=worldTour.toString().length()){
                        worldTour.replace(startIndex, endIndex, "");

                    }
                    System.out.println(worldTour.toString());
                break;

                case "Switch":
                    String oldDestination = command.split(":")[1];
                    String newDestination = command.split(":")[2];
                    int firstIndex = worldTour.indexOf(oldDestination);
                    int stopIndex = firstIndex + oldDestination.length();
                    if (worldTour.toString().contains(oldDestination)) {
                        worldTour.replace(firstIndex, stopIndex, newDestination);
                    }
                    System.out.println(worldTour.toString());

                    break;
            }



            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + worldTour.toString());


    }
}
