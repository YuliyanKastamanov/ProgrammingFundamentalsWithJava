package Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        Map<String, CitiesData>  cities = new TreeMap<>();

        while (!input.equals("Sail")) {

            String currentCity = input.split("[\\|]{2}")[0];
            int population = Integer.parseInt(input.split("[\\|]{2}")[1]);
            int gold = Integer.parseInt(input.split("[\\|]{2}")[2]);

            if (cities.containsKey(currentCity)){
                int existingPopulation = cities.get(currentCity).getPopulation();
                int existingGold = cities.get(currentCity).getGold();
                population+=existingPopulation;
                gold+=existingGold;
                CitiesData currentData = new CitiesData(population, gold);
                cities.put(currentCity, currentData);

            }else {
                CitiesData currentData = new CitiesData(population, gold);
                cities.put(currentCity, currentData);
            }




            input = scanner.nextLine();

        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String currentCommand = command.split("=>")[0];
            String currentTown = command.split("=>")[1];
            int peopleGold = Integer.parseInt(command.split("=>")[2]);
            switch (currentCommand){

                case "Plunder":
                    int gold = Integer.parseInt(command.split("=>")[3]);

                    int restPeople = cities.get(currentTown).getPopulation() - peopleGold;
                    int restGold = cities.get(currentTown).getGold() - gold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", currentTown, gold, peopleGold);
                    if (restPeople==0 || restGold== 0){
                        System.out.println(currentTown +" has been wiped off the map!");
                        cities.remove(currentTown);
                    }else {
                        CitiesData currentData = new CitiesData(restPeople, restGold);
                        cities.put(currentTown, currentData);
                    }
                    break;


                case "Prosper":
                    if (peopleGold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        cities.get(currentTown).setGold(cities.get(currentTown).getGold() + peopleGold);
                        int totalGold = cities.get(currentTown).getGold();
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", peopleGold, currentTown, totalGold);
                    }

                    break;

            }





            command = scanner.nextLine();

        }



        if (cities.size() == 0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            cities.entrySet().stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue().getGold(), e1.getValue().getGold()))
                    .forEach(entry -> System.out.println(entry.getKey() + " -> Population: " + entry.getValue().getPopulation() + " citizens, Gold: " + entry.getValue().getGold() + " kg"));

        }


    }
}
class CitiesData {

    private int population;
    private int gold;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public CitiesData(int population, int gold) {
        this.population = population;
        this.gold = gold;
    }
}
