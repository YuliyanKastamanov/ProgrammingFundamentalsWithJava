package Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String regex = "(?<delimiter>[\\=?\\/?])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int points = 0;
        List<String> destinations = new ArrayList<>();

        while (matcher.find()){
            String currentDestination = matcher.group("destination");
            int currentPoints = currentDestination.length();
            points +=currentPoints;
            destinations.add(currentDestination);
        }
        System.out.printf("Destinations: ");
        for (int i = 0; i < destinations.size(); i++) {
            if (i == 0){
                System.out.printf("%s", destinations.get(i));
            }else {
                System.out.printf(", %s", destinations.get(i));
            }

        }
        System.out.println();
        System.out.printf("Travel Points: %d", points);


    }
}
