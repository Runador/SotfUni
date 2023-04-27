package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numsArr.length; i++) {
            int firstEl = numsArr[i];
            for (int j = i + 1; j < numsArr.length; j++) {
                int secondEl = numsArr[j];
                if (firstEl + secondEl == n) {
                    System.out.println(firstEl + " " + secondEl);
                }
            }

            /*  14 20 60 13 7 19 8
                27                  */

        }
    }
}