package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // 1 2 3 3
        boolean isFound = false;

        for (int i = 0; i <= numbersArr.length - 1; i++) {

            int currentElement = i;
            int leftSum = 0;
            int rightSum = 0;

            if (numbersArr.length == 1) {
                System.out.println(0);
                isFound = true;
                break;
            }

            for (int leftElement = 0; leftElement < currentElement; leftElement++) {
                leftSum += numbersArr[leftElement];
            }

            for (int rightElement = currentElement + 1; rightElement <= numbersArr.length - 1; rightElement++) {
                rightSum += numbersArr[rightElement];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                isFound = true;
                break;
            }

        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
