package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondencedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //  5 0 4 1 2   5+0 0+4 4+1 1+2  5 4 5 3   5+4 4+5 5+3   9 9 8   9+9 9+8      18 17  18+17   35
        int[] condensedNumbers = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {

            int firstNum = numbers[i];
            int secondNum = numbers[i + 1];
            int element = firstNum + secondNum;

            condensedNumbers[i] += element;
        }

    }
}
