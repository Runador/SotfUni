package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        double episode = Double.parseDouble(scanner.nextLine());
        double relax = Double.parseDouble(scanner.nextLine());
        double mealTime = relax / 8;
        double rest = relax / 4;
        double result = relax - mealTime - rest;
        double dif = Math.abs(episode - result);

        if (result >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series,
                    Math.ceil(dif));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series,
                    Math.ceil(dif));
        }
    }
}
