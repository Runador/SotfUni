package arraysExercise;

import java.util.Scanner;

public class ZigZagArrays4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int firstElement = Integer.parseInt(input[0]);
            int secondElement = Integer.parseInt(input[1]);

            if (i % 2 == 0) {
                firstArray[i] = firstElement;
                secondArray[i] = secondElement;
            } else {
                firstArray[i] = secondElement;
                secondArray[i] = firstElement;
            }
        }

        for (int element : firstArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : secondArray) {
            System.out.print(element + " ");
        }
    }
}
