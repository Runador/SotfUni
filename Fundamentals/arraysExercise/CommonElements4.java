package arraysExercise;

import java.util.Scanner;

public class CommonElements4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (int j = 0; j < array2.length; j++) {
            for (int i = 0; i < array1.length; i++) {
                if (array2[j].equals(array1[i])) {
                    System.out.print(array2[j] + " ");
                }
            }
        }
    }
}
