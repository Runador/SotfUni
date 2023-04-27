package textProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            System.out.println(input + " = " + reverseTheString(input));
            input = scanner.nextLine();
        }

    }

    public static StringBuilder reverseTheString(String input) {
        String reversedString = "";
        StringBuilder stringBuilder = new StringBuilder(reversedString);

        for (int i = input.length() - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            stringBuilder.append(symbol);
        }
        return stringBuilder;
    }

}
