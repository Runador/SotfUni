package dataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        if (symbol == Character.toUpperCase(symbol)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
