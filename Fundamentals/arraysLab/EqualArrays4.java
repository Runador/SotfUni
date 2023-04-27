package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean areNotIdentical = false;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            } else {
                sum += firstArray[i];
            }
        }

        if (!areNotIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
