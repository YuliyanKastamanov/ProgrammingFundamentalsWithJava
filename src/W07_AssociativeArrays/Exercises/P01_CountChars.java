package W07_AssociativeArrays.Exercises;

import java.util.*;

public class P01_CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();




        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar ==' '){
                continue;
            }

            if(!result.containsKey(currentChar)){
                result.put(currentChar, 1);
            }else {
                int occurrences = result.get(currentChar);
                occurrences++;
                result.put(currentChar,occurrences);
            }


        }
        //stream
        //result.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        for (Map.Entry<Character, Integer> entry: result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
