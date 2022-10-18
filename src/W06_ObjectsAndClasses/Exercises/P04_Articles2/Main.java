package W06_ObjectsAndClasses.Exercises.P04_Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        List<Articles> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String inputData = scanner.nextLine();
            String [] splitData = inputData.split(",");

            String title = splitData[0];
            String content = splitData[1];
            String author = splitData[2];

            Articles article = new Articles(title, content, author);
            articles.add(article);


        }

        String command = scanner.nextLine();

        switch (command){
            case "title":
                articles.sort(Comparator.comparing(Articles::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Articles::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Articles::getAuthor));
                break;
        }


        for (Articles article : articles) {
            System.out.println(article.toString());
        }
    }
}
