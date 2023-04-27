package textProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        //sh, too_long_username, !lleg@l ch@rs, jeffbutt        jeffbutt
        //Has a length of between 3 and 16 characters.
        //It contains only letters, numbers, hyphens, and underscores.

        for (int i = 0; i < usernames.length; i++) {
            String username = usernames[i];

            boolean isValidLength = isValidLength(username);
            boolean isContainsOnlyLettersNumbersHyphensAndUnderscores = isContainsOnlyLettersNumbersHyphensAndUnderscores(username);

            if (isValidLength && isContainsOnlyLettersNumbersHyphensAndUnderscores) {
                System.out.println(username);
            }
        }

    }

    public static boolean isValidLength(String input) {
        return input.length() >= 3 && input.length() <= 16;
    }

    public static boolean isContainsOnlyLettersNumbersHyphensAndUnderscores (String input) {
        boolean isTrue = false;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            boolean isContainsOtherSymbols = ((symbol >= 33 && symbol <= 47) || (symbol >= 58 && symbol <= 64)
                    || (symbol >= 91 && symbol <= 96) || (symbol >= 123 && symbol <= 127));
            if (Character.isLetter(symbol) || Character.isDigit(symbol)
                || symbol == '-' || symbol == '_' || !isContainsOtherSymbols) {
                isTrue = true;
            } else {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

}
