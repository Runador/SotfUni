package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (scanner.hasNextInt()) {
                int number = Integer.parseInt(input);
                System.out.printf("%d is integer type%n", number);

            } else if (scanner.hasNextDouble()) {
                double number = Double.parseDouble(input);
                System.out.printf("%.2f is floating point type%n", number);

            } else if (scanner.hasNextLine()) {
                char symbol = input.charAt(0);
                System.out.printf("%c is character type%n", symbol);

            } else if (scanner.hasNextBoolean()) {
                boolean boolVar = Boolean.parseBoolean(input);
                System.out.printf("%b is boolean type%n", boolVar);

            } else if (scanner.hasNextLine()) {
                String str = input;
                System.out.printf("%s is string type%n", str);
            }

            input = scanner.nextLine();
        }
    }
}
