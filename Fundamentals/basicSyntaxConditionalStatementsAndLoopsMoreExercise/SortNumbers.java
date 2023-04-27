package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 3; i++) {
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1);
            }
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2);
            }
            if (num3 > num1 && num3 > num2) {
                System.out.println(num3);
            }
        }


    }

    /*private static void printSortedNumbers(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }*/

}

/*Read three real others.numbers and sort them in descending order. Print each number on a new line.*/

