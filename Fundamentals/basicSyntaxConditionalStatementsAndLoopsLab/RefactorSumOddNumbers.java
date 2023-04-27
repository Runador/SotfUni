package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class RefactorSumOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 1) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
