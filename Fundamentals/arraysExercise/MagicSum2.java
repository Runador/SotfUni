package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberArray.length - 1; i++) {
            if ((numberArray[i] + numberArray[i + 1] == number)) {
                System.out.println(numberArray[i] + " " + numberArray[i + 1]);
            }
        }
    }
}

/*
    Write a program that prints
    all unique pairs in an array of integers whose sum is equal to a given number
    1 7 6 2 19 23
    8

*/