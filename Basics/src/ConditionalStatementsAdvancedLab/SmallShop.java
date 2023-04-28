package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (product.equals("coffee") && city.equals("Sofia")) {
            price = 0.50;
        } else if (product.equals("coffee") && city.equals("Plovdiv")) {
            price = 0.40;
        } else if (product.equals("coffee") && city.equals("Varna")) {
            price = 0.45;
        }
        if (product.equals("water") && city.equals("Sofia")) {
            price = 0.80;
        } else if (product.equals("water") && city.equals("Plovdiv")) {
            price = 0.70;
        } else if (product.equals("water") && city.equals("Varna")) {
            price = 0.70;
        }
        if (product.equals("beer") && city.equals("Sofia")) {
            price = 1.20;
        } else if (product.equals("beer") && city.equals("Plovdiv")) {
            price = 1.15;
        } else if (product.equals("beer") && city.equals("Varna")) {
            price = 1.10;
        }
        if (product.equals("sweets") && city.equals("Sofia")) {
            price = 1.45;
        } else if (product.equals("sweets") && city.equals("Plovdiv")) {
            price = 1.30;
        } else if (product.equals("sweets") && city.equals("Varna")) {
            price = 1.35;
        }
        if (product.equals("peanuts") && city.equals("Sofia")) {
            price = 1.60;
        } else if (product.equals("peanuts") && city.equals("Plovdiv")) {
            price = 1.50;
        } else if (product.equals("peanuts") && city.equals("Varna")) {
            price = 1.55;
        }
        System.out.println(price * amount);
    }
}
