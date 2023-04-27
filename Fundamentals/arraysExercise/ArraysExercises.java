package arraysExercise;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String arr[] = scanner.nextLine().split(" ");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(String.join(" ", arr));

        /*String[] input = scanner.nextLine().split(" ");
        for (String element : input) {
            System.out.println(element);
        }

        System.out.println();

        int[] arrayNums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arrayNums[i] = Integer.parseInt(input[i]);
        }

        for (int i : arrayNums) {
            System.out.println(i);
        }

        int numsArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();*/

        /*int n = Integer.parseInt(scanner.nextLine());
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/


        /*String[] monthsArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7) {
            System.out.println(monthsArr[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }*/

        /*System.out.println("How many elements? ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] others.numbers = new int[n];
        System.out.println();
        System.out.println("Enter elements: ");
        for (int i = 0; i < others.numbers.length; i++) {
            others.numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        System.out.println("Array's elements: ");
        for (int num : others.numbers) {
            System.out.print(num + " ");
        }*/


    }


}
