package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                sum1 += numbersArray[i];
            } else {
                sum2 += numbersArray[i];
            }
        }

        System.out.println(sum1 - sum2);
    }
}
