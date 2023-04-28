package WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        int min = Integer.MAX_VALUE;
        String str = scanner.nextLine();

        while (!str.equals("Stop")) {
            int number = Integer.parseInt(str);
            if (number < min) {
                min = number;
            }
            str = scanner.nextLine();
        }

        System.out.println(min);
    }
}
