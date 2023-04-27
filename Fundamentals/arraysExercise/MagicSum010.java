package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArray.length - 1; i++) {
            for (int j = i; j < numbersArray.length - 1; j++) {
                if (numbersArray[i] + numbersArray[j + 1] == n) {
                    System.out.print(numbersArray[i] + " " + numbersArray[j + 1] + "\n");
                    break;
                }
            }
        }

    }
}

/*      1 7 6 2 19 23  |  1 7
        8              |  6 2
 */