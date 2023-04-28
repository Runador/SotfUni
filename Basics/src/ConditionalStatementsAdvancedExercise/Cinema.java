package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        if (projection.equals("Premiere")) {
            System.out.printf("%.2f leva", r * c * 12.00);
        } else if (projection.equals("Normal")) {
            System.out.printf("%.2f leva", r * c * 7.50);
        } else if (projection.equals("Discount")) {
            System.out.printf("%.2f leva", r * c * 5.00);
        }
    }

}
