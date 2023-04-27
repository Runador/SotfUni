package dataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int n = i;
            int sum = 0;

            while (n != 0) {
                sum += n % 10;
                n = n / 10;
            }

            if (sum == 5 || sum == 7 || sum == 14) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
