package W06_ObjectsAndClasses.Exercises.P06_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<VehicleCatalogue> vehicleCatalogues = new ArrayList<>();
        int sumCarsHp = 0;
        int sumTrucksHp = 0;

        int countCars = 0;
        int countTrucks = 0;

        while (!command.equals("End")){

            String[] commandData = command.split("\\s+");

            String type = commandData[0];
            String model = commandData[1];
            String color = commandData[2];
            int horsePower = Integer.parseInt(commandData[3]);
            if (type.equals("car")){
                sumCarsHp+= horsePower;
                countCars++;
            }else {
                sumTrucksHp+=horsePower;
                countTrucks++;
            }


            VehicleCatalogue vehicle = new VehicleCatalogue(type, model, color, horsePower);
            vehicleCatalogues.add(vehicle);

            command = scanner.nextLine();
        }
        double avgCarsHp = 0;
        double avgTrucksHp = 0;
        if (sumCarsHp != 0) {

            avgCarsHp = 1.0 * sumCarsHp/countCars;
        }
        if(sumTrucksHp!=0){
            avgTrucksHp = 1.0 *  sumTrucksHp/countTrucks;
        }


        String secondCommand = scanner.nextLine();

        List<VehicleCatalogue> filteredList = new ArrayList<>(vehicleCatalogues);


        while (!secondCommand.equals("Close the Catalogue")){
             String secondInput = secondCommand;

            //филтрация: people = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

            filteredList = filteredList.stream().filter(vehicle -> vehicle.getModel().equals(secondInput)).collect(Collectors.toList());


            for (VehicleCatalogue vehicle: filteredList) {
                if (vehicle.getType().equals("car")){
                    System.out.println("Type: Car");
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsePower());
                }else {
                    System.out.println("Type: Truck");
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsePower());
                }

            }
            filteredList = vehicleCatalogues;


            secondCommand = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n",avgCarsHp);
        System.out.printf("Trucks have average horsepower of: %.2f.\n",avgTrucksHp);


    }
}
