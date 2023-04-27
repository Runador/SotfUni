package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Integer.parseInt(scanner.nextLine());
        totalPriceCalculation(product, quantity);
    }

    private static void totalPriceCalculation(String product, double quantity) {
        double price = 0;
        switch (product) {
            case "coffee": price = 1.50; break;
            case "water": price = 1.00; break;
            case "coke": price = 1.40; break;
            case "snacks": price = 2.00; break;
        }
        double result = quantity * price;
        System.out.printf("%.2f", result);
    }
}
