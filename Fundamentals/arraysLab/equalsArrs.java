package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class equalsArrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean areIdentical = false;

        for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] == secondArray[i]) {
                    areIdentical = true;
                    sum+=firstArray[i];
                } else {
                    System.out.printf("Arrays are not identical. " +
                            "Found difference at %d index.", i);
                    areIdentical = false;
                    break;
                }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
