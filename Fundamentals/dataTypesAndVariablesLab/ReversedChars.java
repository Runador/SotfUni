package dataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char line1 = scanner.nextLine().charAt(0);
        char line2 = scanner.nextLine().charAt(0);
        char line3 = scanner.nextLine().charAt(0);
        String result = "" + line3 + " " + line2 + " " + line1;
        System.out.println(result);
    }
}
