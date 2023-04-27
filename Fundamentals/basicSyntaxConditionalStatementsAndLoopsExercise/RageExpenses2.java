package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsets = lostGameCount / 2;
        int trashedMouses = lostGameCount / 3;
        int trashedKeyboards = lostGameCount / 6;
        int trashedDisplays = lostGameCount / 12;

        double sum = (headsetPrice * trashedHeadsets) + (mousePrice * trashedMouses) +
                (keyboardPrice * trashedKeyboards) + (displayPrice * trashedDisplays);
        System.out.printf("Rage expenses: %.2f lv.", sum);

    }
}
