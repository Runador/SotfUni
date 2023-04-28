package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1++;
            } else if (num >= 200 && num <= 399) {
                p2++;
            } else if (num >= 400 && num <= 599) {
                p3++;
            } else if (num >= 600 && num <= 799) {
                p4++;
            } else if (num >= 800) {
                p5++;
            }
        }

        double resultP1 = (p1 * 1.0 / n) * 100;
        double resultP2 = (p2 * 1.0 / n) * 100;
        double resultP3 = (p3 * 1.0 / n) * 100;
        double resultP4 = (p4 * 1.0 / n) * 100;
        double resultP5 = (p5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", resultP1);
        System.out.printf("%.2f%%%n", resultP2);
        System.out.printf("%.2f%%%n", resultP3);
        System.out.printf("%.2f%%%n", resultP4);
        System.out.printf("%.2f%%%n", resultP5);
    }
}
