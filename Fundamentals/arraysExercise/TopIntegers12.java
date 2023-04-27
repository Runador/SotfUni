package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArray.length - 1; i++) {
            int firstElement = numbersArray[i];
            int secondElement = numbersArray[i + 1];

                if (firstElement > secondElement) {
                    if (firstElement > numbersArray[numbersArray.length - 1]) {
                        System.out.print(numbersArray[i] + " ");
                    }
                }
            }

        System.out.println(numbersArray[numbersArray.length - 1]);
    }
}

/*Write a program to find all the top integers in an array. A top integer is an integer that is
bigger than all the elements to its right.
9 42 2 13 45 48    ||    48
*/