package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        double protectedNylon = 1.50;
        double dye = 14.50;
        double thinnerOfDye = 5.00;

        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int amountOfDye = Integer.parseInt(scanner.nextLine());
        int amountOfThinner = Integer.parseInt(scanner.nextLine());
        int hoursOfWork = Integer.parseInt(scanner.nextLine());
        double additionalDye = (amountOfDye * 10) / 100.0;
        double allConsumption = ((protectedNylon * nylon) + (dye * amountOfDye) + (thinnerOfDye  * amountOfThinner) +
                + (additionalDye * dye) + (2 * protectedNylon) + 0.40);
        double percent30 = (allConsumption * 30) / 100;
        System.out.println((percent30 * hoursOfWork) + allConsumption);
    }
}

