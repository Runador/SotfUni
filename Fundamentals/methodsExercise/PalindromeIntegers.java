package methodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(isPalindrome(number));
            input = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(int number) {
        String copyNumber = Integer.toString(number);
        String reversedCopyNumber = "";

        for (int i = copyNumber.length() -1 ; i >= 0; i--) {
            char symbol = copyNumber.charAt(i);
            reversedCopyNumber += symbol;
        }

        if (copyNumber.equals(reversedCopyNumber)) {
            return true;
        } else {
            return false;
        }

    }









}
