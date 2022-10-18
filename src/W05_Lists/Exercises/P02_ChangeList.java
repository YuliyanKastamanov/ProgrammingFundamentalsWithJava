package W05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")){


            for (int i = 0; i < numbers.size(); i++) {
                int currentNum = Integer.parseInt(command.get(1));
                if(command.get(0).equals("Delete") && currentNum == numbers.get(i) ){
                    numbers.remove(i);
                } else if (command.get(0).equals("Insert")){
                    int secondNum = Integer.parseInt(command.get(2));
                    numbers.add(secondNum, currentNum);
                    break;
                }
            }


            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
