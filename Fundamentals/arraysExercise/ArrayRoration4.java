package arraysExercise;

import java.util.Scanner;

public class ArrayRoration4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String firstElement = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
