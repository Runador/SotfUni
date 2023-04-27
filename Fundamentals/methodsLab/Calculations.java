package methodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (line.equals("add")) {
            add(firstNumber, secondNumber);
        } else if (line.equals("multiply")) {
            multiply(firstNumber, secondNumber);
        } else if (line.equals("subtract")) {
            subtract(firstNumber, secondNumber);
        } else if (line.equals("divide")) {
            divide(firstNumber, secondNumber);
        }

    }

    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

}
