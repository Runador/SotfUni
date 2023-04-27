package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] condensedArray = new int[integersArray.length - 1];

        for (int i = 0; i < integersArray.length; i++) {

            if (integersArray.length > 1) {
                condensedArray[i] = integersArray[i] + integersArray[i + 1];
                integersArray = condensedArray;
            }

        }

    }
}
