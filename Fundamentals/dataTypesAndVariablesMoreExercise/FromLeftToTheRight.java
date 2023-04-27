package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int left = Integer.parseInt(input[0]);
            int right = Integer.parseInt(input[1]);
            if (left > right) {
                while (left != 0) {
                    int rem = left % 10;
                    sumLeft+=rem;
                    left /= 10;
                }
                System.out.println(sumLeft);
            } else {
                while (right != 0) {
                    int rem = right % 10;
                    sumRight+=rem;
                    right /= 10;
                }
                System.out.println(sumRight);
            }
        }

    }
}
