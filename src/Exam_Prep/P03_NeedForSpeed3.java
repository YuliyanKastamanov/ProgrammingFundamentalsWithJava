package Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03_NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, CarsData> cars = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String currentCar = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            CarsData newCarData = new CarsData(mileage, fuel);
            cars.put(currentCar, newCarData);


        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String currentCommand = command.split(" : ")[0];
            String currentCar = command.split(" : ")[1];

            switch (currentCommand){
                case "Drive":
                    int distance =  Integer.parseInt(command.split(" : ")[2]);
                    int consumedFuel =  Integer.parseInt(command.split(" : ")[3]);

                    if(consumedFuel > cars.get(currentCar).getFuel()){
                        System.out.println("Not enough fuel to make that ride");
                    }else {
                        cars.get(currentCar).setFuel(cars.get(currentCar).getFuel() - consumedFuel);
                        cars.get(currentCar).setMileage(cars.get(currentCar).getMileage() + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", currentCar, distance, consumedFuel);
                        if(cars.get(currentCar).getMileage() >= 100000){
                            cars.remove(currentCar);
                            System.out.printf("Time to sell the %s!%n", currentCar);
                        }
                    }
                    break;

                case "Refuel":
                    int fuelToRefill = Integer.parseInt(command.split(" : ")[2]);
                    int currentFuel = cars.get(currentCar).getFuel();
                    int filledFuel = 0;
                    if(fuelToRefill + currentFuel > 75){
                        cars.get(currentCar).setFuel(75);
                        filledFuel = 75 - currentFuel;
                    }else {
                        cars.get(currentCar).setFuel(fuelToRefill + currentFuel);
                        filledFuel = fuelToRefill;
                    }
                    System.out.printf("%s refueled with %d liters%n", currentCar, filledFuel);
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(command.split(" : ")[2]);
                    int currentMileage = cars.get(currentCar).getMileage();
                    int mileageToSet = currentMileage - kilometers;

                    if(mileageToSet < 10000){
                        cars.get(currentCar).setMileage(10000);
                    }else{
                        cars.get(currentCar).setMileage(mileageToSet);
                        System.out.printf("%s mileage decreased by %d kilometers%n", currentCar, kilometers);
                    }

                    break;

            }


            command = scanner.nextLine();
        }

        cars.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().getMileage(), e1.getValue().getMileage()))
                .forEach(entry -> System.out.println(entry.getKey() + " -> Mileage: " + entry.getValue().getMileage() + " kms, Fuel in the tank: " + entry.getValue().getFuel() + " lt."));



    }
}
    class CarsData {

        private int mileage;
        private int fuel;

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }


        public CarsData(int mileage, int fuel) {
            this.mileage = mileage;
            this.fuel = fuel;
        }
    }


