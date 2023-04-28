package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double metres = Double.parseDouble(scanner.nextLine());
        sum = metres * 7.61;
        double disc = sum * 0.18;
        sum-=disc;
        System.out.printf("The final price is: %.2f lv.%n", sum);
        System.out.printf("The discount is: %.2f lv.", disc);
    }
}
