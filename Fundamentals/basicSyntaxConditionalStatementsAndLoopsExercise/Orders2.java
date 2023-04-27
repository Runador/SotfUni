package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum;
        double total = 0;

        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            sum = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
            total+=sum;
        }

        System.out.printf("Total: $%.2f", total);
    }
}
