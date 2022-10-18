package W07_AssociativeArrays.Labs;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> wordEntry : words.entrySet()) {

            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrWord));
            
        }
    }
}
