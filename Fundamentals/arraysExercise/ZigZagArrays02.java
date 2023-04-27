package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersArray1 = new int[n];
        int[] numbersArray2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int firstNumber = numbersArray[0];
            int secondNumber = numbersArray[1];

            if (i % 2 == 1) {
                numbersArray1[i] = firstNumber;
                numbersArray2[i] = secondNumber;
            } else {
                numbersArray1[i] = secondNumber;
                numbersArray2[i] = firstNumber;
            }
        }

        for (int i = 0; i < numbersArray2.length; i++) {
            System.out.print(numbersArray2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numbersArray1.length; i++) {
            System.out.print(numbersArray1[i] + " ");
        }

    }
}
