package methodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        double result = factorialDivision(number1, number2);
        System.out.printf("%.2f", result);
    }

    private static double factorialDivision(int number1, int number2) {

        int fact1 = 1;
        int fact2 = 1;

        while (number1 > 0) {
            fact1 *= number1;
            number1--;

        }

        while (number2 > 0) {
            fact2 *= number2;
            number2--;
        }

        if (fact1 == 0) {
            return 0;
        } else {
            return (double) fact1 / fact2;
        }

    }
}
