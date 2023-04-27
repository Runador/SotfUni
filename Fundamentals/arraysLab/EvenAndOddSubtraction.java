package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                sumEven+=numbersArray[i];
            } else {
                sumOdd+=numbersArray[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}

/*Write a program that calculates the difference between the sum of
the even and the sum of the odd others.numbers in an array.*/