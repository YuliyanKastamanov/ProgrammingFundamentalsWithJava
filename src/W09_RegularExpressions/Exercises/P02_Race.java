package W09_RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();

        names.forEach(name -> racersDistances.put(name, 0));

        String namesRegex = "[A-Za-z]+";
        Pattern namesPattern = Pattern.compile(namesRegex);

        String numbersRegex = "[0-9]";
        Pattern numbersPattern = Pattern.compile(numbersRegex);

        String input = scanner.nextLine();

        while (!input.equals("end of race")){
            StringBuilder name = new StringBuilder();

            Matcher matcherName = namesPattern.matcher(input);

            while (matcherName.find()){
                name.append(matcherName.group());
            }

            Matcher matcherNumbers = numbersPattern.matcher(input);
            int distance = 0;

            while (matcherNumbers.find()){
                distance += Integer.parseInt(matcherNumbers.group());
            }
            String currentName =  name.toString();

            if(racersDistances.containsKey(currentName)){
                int currentDistance = racersDistances.get(currentName);
                racersDistances.put(currentName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        List<String> sortedNames = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + sortedNames.get(0));
        System.out.println("2nd place: " + sortedNames.get(1));
        System.out.println("3rd place: " + sortedNames.get(2));



    }
}
