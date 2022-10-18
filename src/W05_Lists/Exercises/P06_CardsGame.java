package W05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int count = firstPlayerHand.size();

        while (count!=0){
            int firstPlayerCurrentHand = firstPlayerHand.get(0);
            int secondPlayerCurrentHand = secondPlayerHand.get(0);

            if(firstPlayerCurrentHand == secondPlayerCurrentHand){
                firstPlayerHand.remove(0);
                secondPlayerHand.remove(0);
            } else if (firstPlayerCurrentHand > secondPlayerCurrentHand){
                firstPlayerHand.add(firstPlayerCurrentHand);
                firstPlayerHand.add(secondPlayerCurrentHand);
                firstPlayerHand.remove(0);
                secondPlayerHand.remove(0);
            } else {
                secondPlayerHand.add(secondPlayerCurrentHand);
                secondPlayerHand.add(firstPlayerCurrentHand);
                secondPlayerHand.remove(0);
                firstPlayerHand.remove(0);
            }

            if (firstPlayerHand.size()>secondPlayerHand.size()){
                count = secondPlayerHand.size();
            }else {
                count = firstPlayerHand.size();
            }
            if (firstPlayerHand.size() ==0 || secondPlayerHand.size() == 0){
                break;
            }

        }

        int firstPlayerSum = 0;
        int secondPlayerSum = 0;
        for (int i = 0; i < firstPlayerHand.size(); i++) {
            firstPlayerSum += firstPlayerHand.get(i);

        }
        for (int i = 0; i < secondPlayerHand.size(); i++) {
            secondPlayerSum += secondPlayerHand.get(i);

        }
        if(firstPlayerSum > secondPlayerSum){
            System.out.printf("First player wins! Sum: %d",firstPlayerSum);
        }else {
            System.out.printf("Second player wins! Sum: %d",secondPlayerSum);
        }
    }
}
