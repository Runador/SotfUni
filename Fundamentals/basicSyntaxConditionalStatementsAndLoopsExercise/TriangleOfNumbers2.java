package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            printRow(i, n);
        }

    }

    private static void printRow(int i, int n) {
        System.out.print(n - i + " ");
    }
}
