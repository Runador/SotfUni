package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceOfClothes = Double.parseDouble(scanner.nextLine());
        double decore = budget * 0.10;
        if (statists > 150) {
            priceOfClothes = priceOfClothes - (priceOfClothes * 0.10);
        }
        double sum = statists * priceOfClothes + decore;
        double dif = Math.abs(sum - budget);
        if (sum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", dif);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", dif);
        }
    }
}
