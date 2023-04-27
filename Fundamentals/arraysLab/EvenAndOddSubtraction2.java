package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            int element = numbersArr[i];
            if (element % 2 == 0) {
                sumEven+=element;
            } else {
                sumOdd+=element;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
