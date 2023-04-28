package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());
        double videoCard = 250.0;
        double processor = N * videoCard * 0.35;
        double RAM = N * videoCard * 0.10;
        double sum = (N * videoCard) + (M * processor) + (P * RAM);

        if (N > M) {
            sum = sum - (sum * 0.15);
        }

        double dif = Math.abs(budget - sum);

        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", dif);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", dif);
        }

    }
}
