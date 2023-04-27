package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length - 1; i++) {

            int firstElement = numbers[i];
            int secondElement = numbers[i + 1];

            if (firstElement > secondElement) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.print(numbers[numbers.length - 1]);
    }
}