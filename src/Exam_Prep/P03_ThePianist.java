package Exam_Prep;

import java.util.*;

public class P03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int piecesNumber = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> collection = new TreeMap<>();

        for (int i = 0; i <piecesNumber ; i++) {
            String currentInput = scanner.nextLine();

            List<String> currentList = new ArrayList<>();

            String currentPiece = currentInput.split("\\|")[0];
            String currentComposer = currentInput.split("\\|")[1];
            String currentKey = currentInput.split("\\|")[2];
            currentList.add(currentComposer);
            currentList.add(currentKey);

            collection.put(currentPiece, currentList);

        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            getChangedCollection(collection, command);


            command = scanner.nextLine();
        }

        collection.entrySet().stream()
                //.sorted(Comparator.comparing(n -> n.getValue().get(0)))
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

    }

    private static Map getChangedCollection(Map<String, List<String>> collection, String command) {

        String currentCommand = command.split("\\|")[0];
        String currentPiece = command.split("\\|")[1];
        switch (currentCommand){

            case "Add":
                String currentComposer = command.split("\\|")[2];
                String currentKey = command.split("\\|")[3];

                if(!collection.containsKey(currentPiece)) {
                    List<String> currentList = new ArrayList<>();
                    currentList.add(currentComposer);
                    currentList.add(currentKey);
                    collection.put(currentPiece, currentList);
                    System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposer, currentKey);
                }else {
                    System.out.println(currentPiece + " is already in the collection!");
                }
                break;

            case "Remove":
                if (!collection.containsKey(currentPiece)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                } else {
                    collection.remove(currentPiece);
                    System.out.printf("Successfully removed %s!%n", currentPiece);
                }
                break;

            case "ChangeKey":
                if (!collection.containsKey(currentPiece)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                } else {
                    String newKey = command.split("\\|")[2];
                    collection.get(currentPiece).remove(1);
                    collection.get(currentPiece).add(newKey);
                    System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);

                }
                break;



        }





        return collection;
    }


}
