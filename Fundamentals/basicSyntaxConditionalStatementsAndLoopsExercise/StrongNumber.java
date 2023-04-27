package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int copyNumber = number;
        int reminder;
        int factorial = 1;
        int sum = 0;

        while (number != 0) {
            reminder = number % 10;
            factorial = 1;
            while (reminder != 0) {
                factorial *= reminder;
                reminder--;
            }
            sum += factorial;
            number /= 10;
        }
        if (copyNumber == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
