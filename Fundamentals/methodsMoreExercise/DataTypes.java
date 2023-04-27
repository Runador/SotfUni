package methodsMoreExercise;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String secondInput = scanner.nextLine();

        if (input.equals("int")) {
            int number = Integer.parseInt(secondInput);
            dataTypeChecker(number);
        } else if (input.equals("real")) {
            double doubleNumber = Double.parseDouble(secondInput);
            dataTypeChecker(doubleNumber);
        } else if (input.equals("string")) {
            dataTypeChecker(secondInput);
        }
    }

    private static void dataTypeChecker(int number) {
        System.out.println(number * 2);
    }

    private static void dataTypeChecker(double number) {
        System.out.printf("%.2f", (number * 1.5));
    }

    private static void dataTypeChecker(String str) {
        System.out.println("$" + str + "$");
    }

}
