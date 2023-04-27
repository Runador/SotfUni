package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int copyNumber = number;
        int sum = 0;

        while (number != 0) {

            int reminder = number % 10;
            int factorial = 1;

            while (reminder != 0) {
                factorial*=reminder;
                reminder--;
            }
            sum+=factorial;
            number = number / 10;
        }

        if (copyNumber == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
