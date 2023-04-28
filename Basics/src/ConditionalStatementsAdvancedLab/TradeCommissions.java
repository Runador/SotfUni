package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());
        double percent = 0;
        double result = 0;

        if (volume >= 0 && volume <= 500) {
            if (city.equals("Sofia")) {
                percent = 0.05;
            } else if (city.equals("Varna")) {
                percent = 0.045;
            } else if (city.equals("Plovdiv")) {
                percent = 0.055;
            } else {
                System.out.println("error");
                return;
            }
            result = volume * percent;
        } else if (volume > 500 && volume <= 1000) {
            if (city.equals("Sofia")) {
                percent = 0.07;
            } else if (city.equals("Varna")) {
                percent = 0.075;
            } else if (city.equals("Plovdiv")) {
                percent = 0.08;
            } else {
                System.out.println("error");
                return;
            }
            result = volume * percent;
        } else if (volume > 1000 && volume <= 10000) {
            if (city.equals("Sofia")) {
                percent = 0.08;
            } else if (city.equals("Varna")) {
                percent = 0.10;
            } else if (city.equals("Plovdiv")) {
                percent = 0.12;
            } else {
                System.out.println("error");
                return;
            }
            result = volume * percent;
        } else if (volume > 10000) {
            if (city.equals("Sofia")) {
                percent = 0.12;
            } else if (city.equals("Varna")) {
                percent = 0.13;
            } else if (city.equals("Plovdiv")) {
                percent = 0.145;
            } else {
                System.out.println("error");
                return;
            }
            result = volume * percent;
        } else {
            System.out.println("error");
            return;
        }
        System.out.printf("%.2f", result);
    }

}
