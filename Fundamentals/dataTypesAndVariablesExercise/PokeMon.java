package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceM = Integer.parseInt(scanner.nextLine());
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double fiftyPercent = (distanceM - (distanceM * 0.50));

        while (distanceM >= pokePowerN) {

            if (distanceM == fiftyPercent) {
                distanceM /= exhaustionY;
                break;
            } else {
                distanceM -= pokePowerN;
                counter++;
            }
        }
        System.out.println(distanceM);
        System.out.println(counter);
    }
}
