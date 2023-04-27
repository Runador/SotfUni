package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int snowballValue = 0;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > min) {
                min = snowballValue;
                System.out.printf("%d : %d = %d (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
                break;
            }

        }

    }
}
