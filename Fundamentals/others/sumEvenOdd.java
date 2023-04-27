package others;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                sumEven += numbersArray[i];
            } else {
                sumOdd += numbersArray[i];
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
