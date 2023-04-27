package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int amountOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersSum = (amountOfStudents * lightsabersPrice);
        double lightsabersAll = lightsabersSum + (lightsabersSum * 0.10);
        double freeBeltsCounter = 0;

        while (amountOfStudents != 0) {
            if (amountOfStudents % 6 == 0) {
                freeBeltsCounter++;
            }
            amountOfStudents--;
        }

        double beltsAll = (amountOfStudents + freeBeltsCounter) * beltsPrice;
        double robesAll = amountOfStudents * robesPrice;
        double sumAllPrices = lightsabersAll + beltsAll + robesAll;
        double difference = Math.abs(amountOfMoney - sumAllPrices);

        System.out.println(sumAllPrices);
        System.out.println(difference);

    }
}
