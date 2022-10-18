package W07_AssociativeArrays.Labs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {

                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            }else{
                counts.put(wordInLowerCase, 1);
            }
            
        }


        ArrayList<String> odd = new ArrayList<>();

        for (var entry :counts.entrySet()) {
            if(entry.getValue() % 2 == 1){
                odd.add(entry.getKey());
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if(i< odd.size() -1 ){
                System.out.print(", ");
            }
            
        }
    }
}
