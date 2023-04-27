package dataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f", distance / 1000);
    }
}
