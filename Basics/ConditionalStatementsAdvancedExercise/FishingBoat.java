package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int amountOfFishermens = Integer.parseInt(scanner.nextLine());
        double rentalPrice = 0;

        if (season.equals("Spring")) {
            rentalPrice = 3000;
            if (amountOfFishermens % 2 == 0) {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.20);
                } else {
                    rentalPrice -= (rentalPrice * 0.30);
                }
            } else {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.10);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else {
                    rentalPrice -= (rentalPrice * 0.25);
                }
            }
        } else if (season.equals("Summer")) {
            rentalPrice = 4200;
            if (amountOfFishermens % 2 == 0) {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.20);
                } else {
                    rentalPrice -= (rentalPrice * 0.30);
                }
            } else {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.10);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else {
                    rentalPrice -= (rentalPrice * 0.25);
                }
            }
        } else if (season.equals("Autumn")) {
            rentalPrice = 4200;
            if (amountOfFishermens <= 6) {
                rentalPrice -= (rentalPrice * 0.10);
            } else if (amountOfFishermens <= 11) {
                rentalPrice -= (rentalPrice * 0.15);
            } else {
                rentalPrice -= (rentalPrice * 0.25);
            }
        } else if (season.equals("Winter")) {
            rentalPrice = 2600;
            if (amountOfFishermens % 2 == 0) {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.20);
                } else {
                    rentalPrice -= (rentalPrice * 0.30);
                }
            } else {
                if (amountOfFishermens <= 6) {
                    rentalPrice -= (rentalPrice * 0.10);
                } else if (amountOfFishermens <= 11) {
                    rentalPrice -= (rentalPrice * 0.15);
                } else {
                    rentalPrice -= (rentalPrice * 0.25);
                }
            }
        }
        double dif = Math.abs(budget - rentalPrice);

        if (budget >= rentalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", dif);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", dif);
        }
    }

}
