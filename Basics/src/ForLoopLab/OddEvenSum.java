package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 1) {
                oddSum+=num;
            } else {
                evenSum+=num;
            }
        }

        int dif = Math.abs(evenSum - oddSum);

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + dif);
        }
    }
}
