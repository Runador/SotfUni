package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] numbersArr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isIdentical = false;

        for (int i = 0; i < numbersArr1.length; i++) {
            if (numbersArr1[i] == numbersArr2[i]) {
                sum += numbersArr1[i];
                isIdentical = true;
            } else {
                isIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
