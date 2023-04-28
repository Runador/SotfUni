package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        double result;

        if (symbol == '+') {
            result = N1 + N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %c %.0f = %.0f - even", N1, symbol, N2, result);
            } else {
                System.out.printf("%.0f %c %.0f = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol == '-') {
            result = N1 - N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %c %.0f = %.0f - even", N1, symbol, N2, result);
            } else {
                System.out.printf("%.0f %c %.0f = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol == '*') {
            result = N1 * N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %c %.0f = %.0f - even", N1, symbol, N2, result);
            } else {
                System.out.printf("%.0f %c %.0f = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol == '/') {
            result = N1 / N2;
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %c %.0f = %.2f", N1, symbol, N2, result);
            }
        } else if (symbol == '%') {
            result = N1 % N2;
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %c %.0f = %.0f", N1, symbol, N2, result);
            }
        }
    }

}
