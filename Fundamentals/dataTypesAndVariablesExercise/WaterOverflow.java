package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int litresOfWater = Integer.parseInt(scanner.nextLine());
            sum+=litresOfWater;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum-=litresOfWater;
            }
        }
        System.out.println(sum);
    }
}
