package W05_Lists.Labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")){
            List<String> newCommand = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (newCommand.get(0)){
                case "Contains":
                    int firstNum = Integer.parseInt(newCommand.get(1));
                    boolean isContains = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i) == firstNum){
                            System.out.println("Yes");
                            isContains = true;
                            break;
                        }
                    }
                    if (!isContains){
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String evenOrOdd = newCommand.get(1);
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);

                        if (evenOrOdd.equals("even")) {
                            if (currentNum % 2 == 0){
                                System.out.print(currentNum + " ");
                            }

                        } else{
                            if (currentNum % 2 != 0){
                                System.out.print(currentNum + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = newCommand.get(1);
                    int numberToCheck = Integer.parseInt(newCommand.get(2));
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);
                        if(condition.equals(">")){
                            if(currentNum>numberToCheck){
                                System.out.print(currentNum + " ");
                            }
                        }else if(condition.equals(">=")){
                            if(currentNum>=numberToCheck){
                                System.out.print(currentNum + " ");
                            }
                        }else if(condition.equals("<")) {
                            if (currentNum < numberToCheck) {
                                System.out.print(currentNum + " ");
                            }
                        }else if(condition.equals("<=")) {
                            if (currentNum <= numberToCheck) {
                                System.out.print(currentNum + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
