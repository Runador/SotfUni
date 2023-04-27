package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());

        equals(number1, number2);
    }

    private static void equals(double number1, double number2) {
        double epsilon = 0.000001;

        if (Math.abs(number1 - number2) < epsilon) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
