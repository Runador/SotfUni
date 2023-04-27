package methodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters(String input) {

        for (int i = 0; i < input.length(); i++) {
            //aStringr
            int element = input.length() / 2;

            if (input.length() % 2 == 1) {
                System.out.println(input.charAt(element));
                break;
            } else {
                System.out.println(input.charAt(element - 1) + "" + input.charAt(element));
                break;
            }
        }
    }
}
