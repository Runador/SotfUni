package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] condensedArray = new int[numbersArray.length - 1];

        for (int i = 0; i < numbersArray.length - 1; i++) {

            if (i == 1) {
                break;
            }
            condensedArray[i] = numbersArray[i] + numbersArray[i + 1];
        }

        /*for (int i : condensedArray) {
            System.out.print(i + " ");
        }*/
    }
}
