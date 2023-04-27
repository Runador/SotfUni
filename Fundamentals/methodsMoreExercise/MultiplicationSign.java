package methodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        printMultiplicationSum(number1, number2, number3);
    }

    private static void printMultiplicationSum(int number1, int number2, int number3) {
        int product = 0;

        for (int i = 0; i < 3; i++) {
            product += number1 + number2 + number3;
        }

        if (number1 == 0 || number2 == 0 || number3 == 0) {
            System.out.println("zero");
        }

        if (product > 0) {
            System.out.println("positive");
        } else if (product < 0) {
            System.out.println("negative");
        }

    }
}
