package dataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);

    }
}
