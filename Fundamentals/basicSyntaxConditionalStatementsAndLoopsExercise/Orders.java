package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum;
        double allPrice = 0;

        int N = Integer.parseInt(scanner.nextLine());

        while (N!=0) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            sum = (pricePerCapsule * days) * capsulesCount;
            allPrice+=sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
            N--;
        }

        System.out.printf("Total: $%.2f", allPrice);
    }
}
