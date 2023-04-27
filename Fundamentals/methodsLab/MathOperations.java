package methodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(mathOperation(firstNumber, sign, secondNumber));
    }

    private static int mathOperation(int firstNumber, char sign, int secondNumber) {
        int result = 0;
        if (sign == '+') {
            result = firstNumber + secondNumber;
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
        } else if (sign == '/') {
            result = firstNumber / secondNumber;
        }
        return result;
    }
}
