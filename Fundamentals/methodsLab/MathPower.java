package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = mathPower(value, power);

        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(result));
    }

    private static double mathPower(double value, double power) {
        double sum = 1;
        for (int i = 1; i <= power; i++) {
            sum = sum * value;
        }
        return sum;
    }

}
