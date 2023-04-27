package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (n != 0) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            sum+=litersOfWater;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum-=litersOfWater;
            }
            n--;
        }
        System.out.println(sum);
    }
}
