package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 0; i < numbersArray.length; i++) {

            int firstElement = numbersArray[i];

            for (int j = 0; j < numbersArray.length - 1; j++) {

                int secondElement = numbersArray[j + 1];

                if (firstElement + numbersArray[j + 1] == n) {
                    System.out.println(firstElement + " " + secondElement);
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}

/* 1 7 6 2 19 23
   8             */