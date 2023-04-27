package methodsExercise;

import java.util.Scanner;

public class PasswordValidator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean characterChecker = charactersChecker(password);
        boolean lettersOrDigits = letterOrDigits(password);
        boolean hasTwoDigits = hasTwoDigits(password);

        if (characterChecker && lettersOrDigits && hasTwoDigits) {
            System.out.println("Password is valid");
        }
        if (!characterChecker) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersOrDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }


    private static boolean charactersChecker(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean letterOrDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            int counter = 0;
            char symbol = password.charAt(i);

            if (!((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122) || (symbol >= 48 && symbol <= 57))) {
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
                if (counter == 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
