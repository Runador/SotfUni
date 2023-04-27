package arraysExercise;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray1 = scanner.nextLine().split(" ");

        String[] stringArray2 = scanner.nextLine().split(" ");

        for (int i = 0; i < stringArray2.length; i++) {
            for (int j = 0; j < stringArray1.length; j++) {
                if (stringArray2[i].equals(stringArray1[j])) {
                    System.out.print(stringArray2[i] + " ");
                }
            }
        }
    }
}

/*Write a program that prints common elements in two arrays. You have to compare the
elements of the second array to the elements of the first.*/