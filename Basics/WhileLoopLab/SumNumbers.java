package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > sum) { // делай, пока не станет false, например 100 > 100 = false
            int copyNum = Integer.parseInt(scanner.nextLine());
            sum+=copyNum;
        }

        System.out.println(sum);
    }

}
