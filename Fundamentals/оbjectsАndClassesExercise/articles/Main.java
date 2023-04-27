package оbjectsАndClassesExercise.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] changingInput = scanner.nextLine().split(": ");

            //"Edit: {new content}"
            //"ChangeAuthor: {new author}"
            //"Rename: {new title}"

            String command = changingInput[0];
            String changingContent = changingInput[1];

            if (command.equals("Edit")) {
                article.Edit(changingContent);
            } else if (command.equals("ChangeAuthor")) {
                article.ChangeAuthor(changingContent);
            } else if (command.equals("Rename")) {
                article.Rename(changingContent);
            }

        }

        System.out.println(article.toString());

    }
}
