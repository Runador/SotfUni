package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > max) {
                max = num;
            }
            sum+=num;
        }

        int result = Math.abs(sum - max);

        if (result == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max - result));
        }
    }

}
