package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightSabersTotalAmount = Math.ceil(numberOfStudents + (numberOfStudents * 0.10));
        double beltsFinalAmount = numberOfStudents - (numberOfStudents / 6);
        double beltsTotalPrice = beltsFinalAmount * beltPrice;

        double result = (lightSabersTotalAmount * lightSaberPrice) + beltsTotalPrice + (robePrice * numberOfStudents);

        double neededMoney = Math.abs(amountOfMoney - result);

        if (result <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2f lv.", result);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
