package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {

            int[] arrayNumbers = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt)
                    .toArray();

            int number1 = arrayNumbers[0];
            int number2 = arrayNumbers[1];

            if (i % 2 == 0) {
                array1[i] += number1;
                array2[i] += number2;
            } else {
                array1[i] += number2;
                array2[i] += number1;
            }

        }
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : array2) {
            System.out.print(num + " ");
        }

    }
}

/*Write a program that creates 2 arrays. You will be given an integer n.
On the next n lines, you get 2 integers. Form 2 arrays as shown below.
 */