package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        double min = Double.MIN_VALUE;
        String trueModel = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * (radius * radius) * height;
            if (volume > min) {
                min = volume;
                trueModel = model;
            }
        }
        System.out.println(trueModel);
    }
}
