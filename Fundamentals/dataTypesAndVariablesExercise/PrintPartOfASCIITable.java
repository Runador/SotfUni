package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = start; i <= end; i++) {
            char symbol = (char) i;
            output += symbol + " ";
        }

        System.out.println(output);
    }
}
