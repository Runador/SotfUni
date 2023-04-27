package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isEqual = false;
        int wrongIndex = 0;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    sum+=numbers1[i];
                    isEqual = true;
                } else {
                    isEqual = false;
                    wrongIndex = j;
                }
            }
        }

        if (isEqual) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.printf("Arrays are not identical." +
                    " Found difference at %d index.", wrongIndex);
        }

    }
}

