package W07_AssociativeArrays.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        TreeMap<String, Integer> junkMaterials  = new TreeMap<>();
        keyMaterials.put("shards" , 0);
        keyMaterials.put("fragments" , 0);
        keyMaterials.put("motes" , 0);

        boolean isObtained = false;
        //123 silver 6 shards 8 shards 5 motes 9 fangs 75 motes 103 MOTES 8 Shards 86 Motes 7 stones 19 silver

        while (!isObtained){

            while (input.size() != 0) {
                int quantity = Integer.parseInt(input.get(0));
                String currentMaterial = input.get(1).toLowerCase();

                switch (currentMaterial) {
                    case "shards":
                        if (updateMaterialMap(keyMaterials, currentMaterial, quantity)) {
                            System.out.println("Shadowmourne obtained!");
                            isObtained = true;
                        }
                        break;
                    case "fragments":
                        if (updateMaterialMap(keyMaterials, currentMaterial, quantity)) {
                            System.out.println("Valanyr obtained!");
                            isObtained = true;
                        }
                        break;
                    case "motes":
                        if (updateMaterialMap(keyMaterials, currentMaterial, quantity)) {
                            System.out.println("Dragonwrath obtained!");
                            isObtained = true;
                        }
                        break;
                    default:
                        updateMaterialMap(junkMaterials, currentMaterial, quantity);
                        break;
                }

                if (isObtained) {
                    break;
                }
                input.remove(0);
                input.remove(0);
            }
            if (isObtained) {
                break;
            }

            input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());




        }

        keyMaterials.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMaterials.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


    }
    private static boolean updateMaterialMap(TreeMap<String, Integer> materials, String currentMaterial, int quantity) {
        boolean isObtained = false;;
        int newValue;

        if (!materials.containsKey(currentMaterial)) {
            materials.put(currentMaterial, quantity);
        } else {
            newValue = materials.get(currentMaterial) + quantity;
            materials.replace(currentMaterial, newValue);
        }
        if (currentMaterial.equals("shards") || currentMaterial.equals("fragments") || currentMaterial.equals("motes")) {
            if (materials.get(currentMaterial) >= 250) {
                newValue = materials.get(currentMaterial) - 250;
                materials.replace(currentMaterial, newValue);
                isObtained = true;
            }
        }
        return isObtained;
    }
}
