package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] strArray = new String[n];

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            strArray[i] = input;

            if (input.equals("(") || input.equals(")")) {

            }
        }

    }
}
