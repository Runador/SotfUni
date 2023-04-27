package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        int product = multiplier * times;

        do {
            System.out.printf("%d X %d = %d", multiplier, times, product);
            times++;
        } while (times > 10);

        if (times <= 10) {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", multiplier, times, multiplier * times);
            }
        }

    }
}
