package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArr = new int[numbersArr.length - 1];

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr.length == 1) {
                System.out.println(numbersArr[i]);
                break;
            }

            int[] condensedArr = new int[secondArr.length - 1 - i];
            condensedArr[i] = numbersArr[i] + numbersArr[i + 1];

        }

    }
}
