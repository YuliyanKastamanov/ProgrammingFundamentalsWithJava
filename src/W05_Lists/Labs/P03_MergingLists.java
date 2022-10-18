package W05_Lists.Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int smallerSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallerSize; i++) {
            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");

        }

        printRestElements (firstList, smallerSize);
        printRestElements (secondList, smallerSize);





    }

    private static void printRestElements(List<Integer> List, int startIndex) {
        for (int i = startIndex; i <List.size() ; i++) {
            System.out.print(List.get(i)+ " ");

        }
    }
}
