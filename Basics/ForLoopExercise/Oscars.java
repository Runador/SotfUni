package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int quantityOfJudges = Integer.parseInt(scanner.nextLine());

        double allPointsFromJudge = 0;
        double sumOfAllPoints = 0;
        double sum = 0;

        for (int i=0; i < quantityOfJudges; i++) {

            String nameOfJudge = scanner.nextLine();
            double pointsOfJudge = Double.parseDouble(scanner.nextLine());

            allPointsFromJudge = (nameOfJudge.length() * pointsOfJudge) / 2;

            if (sumOfAllPoints < 1250.5) {
                sum += allPointsFromJudge;
                sumOfAllPoints = academyPoints + sum;
            }
        }

        double leftPoints = 1250.5 - sumOfAllPoints;

        if (sumOfAllPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, sumOfAllPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, leftPoints);
        }
    }
}
