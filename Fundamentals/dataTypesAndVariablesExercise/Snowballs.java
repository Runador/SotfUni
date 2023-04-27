package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;

        while (n != 0) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = snowballSnow / snowballTime;
            snowballValue = Math.pow(snowballValue, snowballQuality);
            if (maxValue < snowballValue) {
                maxValue = snowballValue;
                System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
            n--;
        }
    }
}
