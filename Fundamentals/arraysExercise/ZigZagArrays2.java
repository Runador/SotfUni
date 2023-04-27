package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];


        for (int i = 0; i < n; i++) {

            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int firstElement = numbers[0];
            int secondElement = numbers[1];

            if (i % 2 != 0) {
                array2[i] = firstElement;
                array1[i] = secondElement;
            } else {
                array1[i] = firstElement;
                array2[i] = secondElement;
            }

        }

        for (int number : array1) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : array2) {
            System.out.print(number + " ");
        }

    }
}
