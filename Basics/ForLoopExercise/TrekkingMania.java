package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        int amountOfGroups = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double kilim = 0;
        double k2 = 0;
        double everest = 0;
        double sum = 0;
        double musalaPercent = 0;
        double monblanPercent = 0;
        double kilimPercent = 0;
        double k2Percent = 0;
        double everestPercent = 0;

        for (int i = 0; i < amountOfGroups; i++) {
            int amountOfPeople = Integer.parseInt(scanner.nextLine());
            if (amountOfPeople <= 5) {
                musala+=amountOfPeople;
            } else if (amountOfPeople <= 12) {
                monblan+=amountOfPeople;
            } else if (amountOfPeople <= 25) {
                kilim+=amountOfPeople;
            } else if (amountOfPeople <= 40) {
                k2 +=amountOfPeople;
            } else {
                everest+=amountOfPeople;
            }

            sum = musala + monblan + kilim + k2 + everest;
            musalaPercent = (musala / sum) * 100.0;
            monblanPercent = (monblan / sum) * 100.0;
            kilimPercent = (kilim / sum) * 100.0;
            k2Percent = (k2 / sum) * 100.0;
            everestPercent = (everest / sum) * 100.0;
        }

        System.out.printf("%.2f%%\n", musalaPercent);
        System.out.printf("%.2f%%\n", monblanPercent);
        System.out.printf("%.2f%%\n", kilimPercent);
        System.out.printf("%.2f%%\n", k2Percent);
        System.out.printf("%.2f%%", everestPercent);
    }

}
