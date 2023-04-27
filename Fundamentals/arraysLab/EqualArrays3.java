package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArray1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] numsArray2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0; // ctrl + d - продублировать

        boolean areIdentical = false;

        for (int i = 0; i < numsArray1.length; i++) {
            int element = numsArray1[i];
            if (numsArray1[i] == numsArray2[i]) {
                sum+=element;
                areIdentical = true;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
