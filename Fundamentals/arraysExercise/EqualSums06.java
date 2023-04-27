package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //1 2 3 3      2

        boolean areEqual = false;

        for (int i = 0; i <= numbersArray.length - 1; i++) {

            int leftSum = 0;
            int rightSum = 0;

            int currentIndex = i;

            for (int leftIndex = 0; leftIndex < currentIndex; leftIndex++) {
                leftSum += numbersArray[leftIndex];
            }

            for (int rightIndex = currentIndex + 1; rightIndex <= numbersArray.length - 1; rightIndex++) {
                rightSum+=numbersArray[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(currentIndex);
                areEqual = true;
                break;
            }

        }

        if (!areEqual) {
            System.out.println("no");
        }

    }
}
