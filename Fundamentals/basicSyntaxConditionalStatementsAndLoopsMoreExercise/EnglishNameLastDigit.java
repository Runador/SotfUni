package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class EnglishNameLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        lastDigitName(number);
    }

    private static int lastDigitName(int number) {
        int reminder = number % 10;
        if (reminder == 1) {
            System.out.printf("one");
        } else if (reminder == 2) {
            System.out.println("two");
        } else if (reminder == 3) {
            System.out.println("three");
        } else if (reminder == 4) {
            System.out.println("four");
        } else if (reminder == 5) {
            System.out.println("five");
        } else if (reminder == 6) {
            System.out.println("six");
        } else if (reminder == 7) {
            System.out.println("seven");
        } else if (reminder == 8) {
            System.out.println("eight");
        } else if (reminder == 9) {
            System.out.println("nine");
        } else if (reminder == 0) {
            System.out.println("zero");
        }
        return reminder;
    }

}

/*Write a method that returns the English name of the last digit of a given number.
Write a program that reads an integer and prints the returned value from this method.*/