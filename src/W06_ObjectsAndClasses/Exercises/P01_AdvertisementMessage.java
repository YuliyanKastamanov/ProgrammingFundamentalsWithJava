package W06_ObjectsAndClasses.Exercises;

import java.lang.reflect.Array;
import java.util.*;

public class P01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int advertiseCount = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random randomPhrases = new Random();
        Random randomEvents = new Random();
        Random randomAuthors = new Random();
        Random randomCities = new Random();

        for (int i = 0; i < advertiseCount; i++) {
            int randomIndexPhrases = randomPhrases.nextInt(phrases.size());
            int randomIndexEvents = randomEvents.nextInt(events.size());
            int randomIndexAuthors = randomAuthors.nextInt(authors.size());
            int randomIndexCities = randomCities.nextInt(cities.size());

            System.out.println(phrases.get(randomIndexPhrases) + " " + events.get(randomIndexEvents) + " " + authors.get(randomIndexAuthors) + " - " + cities.get(randomIndexCities));

        }



    }
}
