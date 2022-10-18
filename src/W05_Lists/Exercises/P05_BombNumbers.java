package W05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = secondNumbers.get(0);
        int power = secondNumbers.get(1);

        for (int i = 0; i < numbers.size(); i++) {
            int startIndex = 0;
            int finishIndex = 0;

            if (bombNumber == numbers.get(i)){
                startIndex = i - power;
                if (startIndex < 0){
                    startIndex = 0;
                }
                finishIndex = power + i;

                if (finishIndex>= numbers.size()){
                    finishIndex = numbers.size()-1;
                }

                for (int j = startIndex; j <=finishIndex ; j++) {
                    numbers.remove(startIndex);
                    
                }
                i = 0;
            }


        }
        int sum = 0;
        for (int number : numbers) {
            sum+=number;
        }
        System.out.println(sum);


    }
}
