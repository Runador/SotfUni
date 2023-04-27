package arraysExercise;

import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArray = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String firstElement = stringsArray[0];

            for (int j = 0; j < stringsArray.length - 1; j++) {
                stringsArray[j] = stringsArray[j + 1];
            }

            stringsArray[stringsArray.length - 1] = firstElement;

            // 51 47 32 61 21
            // 2
        }



        for (int i = 0; i < stringsArray.length; i++) {
            System.out.print(stringsArray[i] + " ");
        }

    }
}
