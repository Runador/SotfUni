package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String typeOfVacation = "";
        double spendedMoney = 0;

        if (season.equals("summer")) {
            typeOfVacation = "Camp";
            if (budget <= 100) {
                destination = "Bulgaria";
                spendedMoney = budget - (budget * 0.70);
            } else if (budget <= 1000) {
                destination = "Balkans";
                spendedMoney = budget - (budget * 0.60);
            } else if (budget > 1000) {
                typeOfVacation = "Hotel";
                destination = "Europe";
                spendedMoney = budget - (budget * 0.10);
            }
        } else if (season.equals("winter")) {
            typeOfVacation = "Hotel";
            if (budget <= 100) {
                destination = "Bulgaria";
                spendedMoney = budget - (budget * 0.30);
            } else if (budget <= 1000) {
                destination = "Balkans";
                spendedMoney = budget - (budget * 0.20);
            } else if (budget > 1000) {
                destination = "Europe";
                spendedMoney = budget - (budget * 0.10);
            }
        }

        if (budget >= spendedMoney) {
            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f", typeOfVacation, spendedMoney);
        }
    }

}
