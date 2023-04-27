package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double currentBalance = Double.parseDouble(input);
        double copyCurrentBalance = currentBalance;
        double price = 0;
        input = scanner.nextLine();

        while (!input.equals("Game Time")) {

            if (input.equals("OutFall 4")) {
                price = 39.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought OutFall 4");
                    currentBalance -= price;
                }
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought CS: OG");
                    currentBalance -= price;
                }
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought Zplinter Zell");
                    currentBalance -= price;
                }
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought Honored 2");
                    currentBalance -= price;
                }
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought RoverWatch");
                    currentBalance -= price;
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (currentBalance < price) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought RoverWatch Origins Edition");
                    currentBalance -= price;
                }
            } else {
                System.out.println("Not Found");
            }

            input = scanner.nextLine();
        }

        if (currentBalance <= 0) {
            System.out.println("Out of money!");
        } else {
            double totalSpent = copyCurrentBalance - currentBalance;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }

    }
}
