package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int speakingDollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int allToysCount = puzzlesCount + speakingDollsCount + bearsCount + minionsCount + trucksCount;
        double sumAllToys = (puzzlesCount * 2.60) + (speakingDollsCount * 3.0) + (bearsCount * 4.10) +
                (minionsCount * 8.20) + (trucksCount * 2.0);

        if (allToysCount >= 50) {
            sumAllToys = sumAllToys - (sumAllToys * 0.25);
        }

        double sumAfterRent = sumAllToys - (sumAllToys * 0.10);
        double dif = Math.abs(excursionPrice - sumAfterRent);

        if (sumAfterRent >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", dif);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", dif);
        }
    }
}
