package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCounter = lostGamesCount / 2;
        int mouseCounter = lostGamesCount / 3;
        int keyboardCounter = lostGamesCount / 6;
        int displayCounter = lostGamesCount / 12;

        double rageExpenses = (headsetCounter * headsetPrice) + (mouseCounter * mousePrice) +
                (keyboardCounter * keyboardPrice) + (displayCounter * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}

