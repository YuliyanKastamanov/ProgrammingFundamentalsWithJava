package W05_Lists.Labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());



        String fistElement = command.get(0);
        int secondElement = Integer.parseInt(command.get(1));
        int thirdElement = 0;


        while (!fistElement.equals("end")){

            switch (fistElement){
                case "Add":
                numbers.add(secondElement);
                break;

                case "Remove":
                    numbers.remove(Integer.valueOf(secondElement));
                    break;

                case "RemoveAt":
                    numbers.remove(secondElement);
                    break;

                case "Insert":
                   numbers.add(thirdElement, secondElement);
                    break;
            }
            List<String> newCommand = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            fistElement = newCommand.get(0);
            if (newCommand.size()>=2) {
                secondElement = Integer.parseInt(newCommand.get(1));
            }
            if (newCommand.size()==3){
                thirdElement = Integer.parseInt(newCommand.get(2));
            }






        }

        for (Integer number: numbers) {

            System.out.print(number + " ");


        }




    }
}
