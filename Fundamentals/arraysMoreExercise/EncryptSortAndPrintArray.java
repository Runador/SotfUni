package arraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int vowelsSum = 0;
        int consonantSum = 0;
        int[] names = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            char[] name = input.toCharArray();
            vowelsSum = 0;
            consonantSum = 0;

            for (int j = 0; j < name.length; j++) {
                char symbol = name[j];
                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                    vowelsSum += (int) symbol * name.length;
                } else {
                    consonantSum += (int) symbol / name.length;
                }
                int result = vowelsSum + consonantSum;
                names[i] = result;
            }
        }

        Arrays.sort(names);

        for (int name : names) {
            System.out.println(name);
        }
    }
}
