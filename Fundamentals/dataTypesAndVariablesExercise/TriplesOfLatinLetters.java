package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("a");
            for (int j = 0; j < n; j++) {
                System.out.println("b");

                for (int k = 0; k < n; k++) {
                    System.out.println("c");

                }
            }
        }
    }
}
