package methodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printCharacters(symbol1, symbol2);
    }

    private static void printCharacters(char symbol1, char symbol2) {

        for (int i = symbol1 + 1; i < symbol2; i++) {
            System.out.print((char) i + " ");
        }

        String str = "";

        for (int i = symbol1 - 1; i > symbol2; i--) {
            str += " " + (char) i;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
