package textProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> symbols = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                digits.add(symbol);
            } else if (Character.isLetter(symbol)) {
                letters.add(symbol);
            } else if ((symbol >= 33 && symbol <= 47) || (symbol >= 58 && symbol <= 64)
                    || (symbol >= 91 && symbol <= 96) || (symbol >= 123 && symbol <= 127)) {
                symbols.add(symbol);
            }
        }

        System.out.println(digits.toString().replaceAll("[\\[\\], ]", ""));
        System.out.println(letters.toString().replaceAll("[\\[\\], ]", ""));
        System.out.println(symbols.toString().replaceAll("[\\[\\], ]", ""));

    }
    
}
