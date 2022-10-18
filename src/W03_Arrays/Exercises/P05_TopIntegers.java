package W03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")). //
                mapToInt(e->Integer.parseInt(e))
                .toArray();

        for(int index = 0; index <= numbers.length - 1 ;index++){
            int currentNum = numbers[index];
            if(index == numbers.length-1) { // за последното число => винаги го принтираме
                System.out.print(currentNum);
                break;
            }
            boolean isBigger = false;

            for(int i = index+1; i <= numbers.length - 1;i++){

                if(currentNum > numbers[i]){
                    isBigger = true;
                }else {
                    isBigger = false;
                    break; // открили сме несъответствие => числото не е > от всички числа и няма смисъл да проверяваме повече
                }
            }
            if (isBigger){
                System.out.print(currentNum + " ");
            }
        }

    }
}
