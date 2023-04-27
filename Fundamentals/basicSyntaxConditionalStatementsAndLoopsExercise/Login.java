package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String passwordReversed = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            passwordReversed+=symbol;
        }

        String correctPassword = scanner.nextLine();
        int counter = 0;

        while (!correctPassword.equals(passwordReversed)) {
            counter++;
            if (counter > 3) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                correctPassword = scanner.nextLine();
            }
        }
        if (correctPassword.equals(passwordReversed)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
