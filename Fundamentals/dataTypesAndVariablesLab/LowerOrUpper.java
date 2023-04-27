package dataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        for (char i = 97; i <= 122; i++) {
            if (symbol == i) {
                System.out.println("lower-case");
            }
        }

        for (char i = 65; i <= 90; i++) {
            if (symbol == i) {
                System.out.println("upper-case");
            }
        }

    }
}
