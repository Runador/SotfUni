package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int amountFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        if (typeOfFlowers.equals("Roses")) {
            sum = amountFlowers * 5;
            if (amountFlowers > 80) {
                sum *= 0.90;
            }
        } else if (typeOfFlowers.equals("Dahlias")) {
            sum = amountFlowers * 3.80;
            if (amountFlowers > 90) {
                sum *= 0.85;
            }
        } else if (typeOfFlowers.equals("Tulips")) {
            sum = amountFlowers * 2.80;
            if (amountFlowers > 80) {
                sum *= 0.85;
            }
        } else if (typeOfFlowers.equals("Narcissus")) {
            sum = amountFlowers * 3;
            if (amountFlowers < 120) {
                sum += (sum * 0.15);
            }
        } else if (typeOfFlowers.equals("Gladiolus")) {
            sum = amountFlowers * 2.50;
            if (amountFlowers < 80) {
                sum += (sum * 0.20);
            }
        }
        double dif = Math.abs(budget - sum);

        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    amountFlowers, typeOfFlowers, dif);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", dif);
        }
    }

}
