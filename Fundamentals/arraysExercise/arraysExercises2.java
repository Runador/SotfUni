package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class arraysExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Condense Array to Number

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int i = 0; i < integerArray.length; i++) {

            if (integerArray.length == 1) {
                break;
            }

            int element = integerArray[i];
            int lastElement = integerArray[integerArray.length - 1];

            for (int j = i + 1; j < integerArray.length; j++) {
                element += integerArray[j];
                sum += element;
            }

            System.out.println(sum);
        }

        // Equal Arrays

        /*int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean areIdentical = false;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            } else {
                sum+=firstArray[i];
                areIdentical = true;
            }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }*/

        //Even and Odd Subtraction

        /*int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        for (int j : numbersArray) {
            if (j % 2 == 0) {
                sumEvenNumbers += j;
            } else {
                sumOddNumbers += j;
            }
        }

        System.out.println(sumEvenNumbers - sumOddNumbers);*/

        //⦁	Reverse an Array of Strings

        /*String[] stringArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringArray.length / 2; i++) {
            String firstElement = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = firstElement;
        }

        for (String element : stringArray) {
            System.out.print(element + " ");
        }*/

        //⦁	Sum Even Numbers

        /*int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEvenNumbers = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                sumEvenNumbers+=numbersArray[i];
            }
        }
        System.out.print(sumEvenNumbers + " ");*/

        // ⦁ Print Numbers in Reverse Order

        /*int n = Integer.parseInt(scanner.nextLine());
        int[] others.numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            others.numbers[i] = number;
        }

        for (int i = others.numbers.length - 1; i >= 0; i--) {
            System.out.print(others.numbers[i] + " ");
        }*/

        //⦁	Day of Week
        /*String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(daysOfWeek[n - 1]);*/

        // Lab: Arrays

    }
}