package methodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //Its sum of digits is divisible by 8, e.g. 8, 16, 88.
        //Holds at least one odd digit, e.g. 232, 707, 87578.

        isDivisibleBy8(n);

    }

    private static boolean isDivisibleBy8(int number) {
        int reminder;
        int sum = 0;
        while (number != 0) {
            reminder = number % 10;
            sum += reminder;
            if (sum % 8 == 0) {
                return true;
            }
            number--;
        }
        return false;
    }

    /*private static boolean isHoldAtLeast1Digit(int number) {

    }*/

}
