package methodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        passwordValidator(password);
    }

    private static void passwordValidator(String password) {

        boolean isValidCharacters = isValidCharacterChecking(password);
        boolean isValidLettersOrDigits = isLettersOrDigits(password);
        boolean isValidTwoDigits = hasTwoDigits(password);

        if (isValidCharacters && isValidLettersOrDigits && isValidTwoDigits) {
            System.out.println("Password is valid");
        }
        if (!isValidCharacters) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidLettersOrDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isValidCharacterChecking(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isLettersOrDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            int character = password.charAt(i);
            if ((character >= 33 && character <= 47) || (character >= 58 && character <= 64)
                    || (character >= 92 && character <= 96) || (character >= 123 && character <= 126)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counter++;
            }
        }
        if (counter < 2) {
            return false;
        } else {
            return true;
        }
    }
        /*int counter = 0;
        for (int i = 0; i <= password.length(); i++) {
            int digit = i;
            if ((digit >= 65 && digit <= 90) || (digit >= 97 && digit <= 122)) {
                counter++;
            }
        }
        if (counter >= 6 && counter <= 10) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }*/

}
