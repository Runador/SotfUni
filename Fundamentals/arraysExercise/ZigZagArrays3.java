package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            int firstElement = arrayNumbers[0];
            int secondElement = arrayNumbers[1];

            if ((i + 1) % 2 == 0) {
                array1[i] = secondElement;
                array2[i] = firstElement;
            } else {
                array1[i] = firstElement;
                array2[i] = secondElement;
            }
        }

        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : array2) {
            System.out.print(element + " ");
        }
    }
}
