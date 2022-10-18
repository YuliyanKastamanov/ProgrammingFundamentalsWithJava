package Fundamentals_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command =  scanner.nextLine();

        Map<String, List<String>> stores = new TreeMap<>();
        List<String> allItems = new ArrayList<>();
        List<String> importantItems = new ArrayList<>();

        while (!command.equals("Go Shopping")){
            String[] tokens = command.split("->");
            String currentCommand = tokens[0];
            String currentStore = tokens[1];

            switch (currentCommand){
                case "Add":
                    String[] itemsToList = tokens[2].split(",");
                    List<String> items = new ArrayList<>();
                    boolean isContains = false;

                    for (int i = 0; i < itemsToList.length; i++) {
                        String currentItem = itemsToList[i];
                        if (!allItems.contains(currentItem)){
                            items.add(currentItem);
                            allItems.add(currentItem);
                        }
                    }
                    if(!stores.containsKey(currentStore)){
                        stores.put(currentStore, items);

                    }else {

                        if(items.size()>0){
                            List<String> itemsToChange = stores.get(currentStore);
                            itemsToChange.add(itemsToList[0]);
                            stores.put(currentStore, itemsToChange);
                        }
                    }
                    break;

                case "Important":
                    String majorItem = tokens[2];
                    importantItems.add(currentStore);
                    if (!allItems.contains(majorItem)) {
                        if (!stores.containsKey(currentStore)) {

                            List<String> item = new ArrayList<>();
                            item.add(majorItem);
                            stores.put(currentStore, item);
                        } else {
                            List<String> itemsToChange = stores.get(currentStore);
                            itemsToChange.add(0, majorItem);
                            stores.put(currentStore, itemsToChange);

                        }

                    }
                    break;
                case "Remove":
                    if(!importantItems.contains(currentStore)){
                        stores.remove(currentStore);
                    }
                    break;
            }

            command = scanner.nextLine();

        }

        stores.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("- " + entry.getValue().get(i));
                    }
                });




    }
}
