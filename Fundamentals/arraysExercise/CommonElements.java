package arraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (String elementArray1 : array1) {
            for (String elementArray2 : array2) {
                if (elementArray1.equals(elementArray2)) {
                    System.out.print(elementArray1 + " ");
                }
            }
        }

    }
}

/*Write a program that prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
 */