package arraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] namesInt = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int vowelsCounter = 0;
            int consonantsCounter = 0;

            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);

                if (symbol == 'A' || symbol == 'a' || symbol == 'E' || symbol == 'e'
                    || symbol == 'I' || symbol == 'i' || symbol == 'O' || symbol == 'o'
                    || symbol == 'U' || symbol == 'u') {
                    vowelsCounter += symbol * input.length();
                } else {
                    consonantsCounter += symbol / input.length();
                }
            }

            int result = vowelsCounter + consonantsCounter;
            namesInt[i] = result;
        }

        int[] sortedNamesInt = new int[namesInt.length];

        for (int i = 0; i < namesInt.length; i++) {
            sortedNamesInt[i] = namesInt[i];
        }

        for (int i = 1; i < sortedNamesInt.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sortedNamesInt[j] < sortedNamesInt[j - 1]) {
                    int temp = sortedNamesInt[j];
                    sortedNamesInt[j] = sortedNamesInt[j - 1];
                    sortedNamesInt[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < sortedNamesInt.length; i++) {
            System.out.println(sortedNamesInt[i] + " ");
        }

    }
}
