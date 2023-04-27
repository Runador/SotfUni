package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            int counter = 1;
            if (max < sum) {
                max = sum;
            }
            int firstEl = numbersArr[i];
            for (int j = i + 1; j < numbersArr.length; j++) {
                int secondEl = numbersArr[j];
                if (firstEl == secondEl) {
                    counter++;
                    sum += counter;
                } else {
                    break;
                }
            }
        }
    }
}
// 1 1 1 2 3 1 3 3  1 1 1
/*   2 1 1 2 3 3 2 2 2 1	   2 2 2
 */