package Exam_Prep;

import java.util.*;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plantsNumber = Integer.parseInt(scanner.nextLine());



        Map<String, Integer> plantsRarity = new HashMap<>();
        Map<String, List<Double>> plantsRating = new HashMap<>();




        for (int i = 0; i < plantsNumber; i++) {
            String input = scanner.nextLine();
            String currentPlant = input.split("<->")[0];
            int currentPlantRarity = Integer.parseInt(input.split("<->")[1]);

            if (plantsRarity.containsKey(currentPlant)) {
                //plantsRarity.remove(currentPlant);
                plantsRarity.put(currentPlant, currentPlantRarity);
            }else {
                plantsRarity.put(currentPlant, currentPlantRarity);
                plantsRating.put(currentPlant, new ArrayList<>());
            }

        }


        String command = scanner.nextLine();

        while (!command.equals("Exhibition")){

            String currentCommand = command.split(": ")[0];
            String[] plantsData = command.split(": ")[1].split(" - ");
            String plant = plantsData[0];

            if (!plantsRarity.containsKey(plant)) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }

            switch (currentCommand){


                case"Reset":

                    plantsRating.get(plant).clear();
                    break;

                case "Rate":
                    double currentRating = Double.parseDouble(plantsData[1]);
                    plantsRating.get(plant).add(currentRating);
                    break;

                case "Update":
                    int rarityToUpdate = Integer.parseInt(plantsData[1]);
                    plantsRarity.put(plant, rarityToUpdate );

                    break;

                default:
                    System.out.println("error");
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
      plantsRarity.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
              .thenComparingDouble(x -> plantsRating.get(x.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0))
              .reversed())
              .forEach(entry -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f",
              entry.getKey(), entry.getValue(),
              plantsRating.get(entry.getKey()).stream()
                      .mapToDouble(Double::doubleValue)
                      .average().orElse(0.0))));


    }
}
