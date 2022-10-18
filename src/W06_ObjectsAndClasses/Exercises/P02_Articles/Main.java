package W06_ObjectsAndClasses.Exercises.P02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String [] splitData = inputData.split(",");

        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(":");

            switch (command[0]){
                case "Edit":
                    article.edit(command[1]);
                    break;

                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;

                case "Rename":
                    article.changeTitle(command[1]);
                    break;
            }

        }

        System.out.println(article.toString());



    }
}
