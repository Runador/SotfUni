package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        if (type.equals("objectsAndClassesLab.Students") && day.equals("Friday")) {
            sum = people * 8.45;
        } else if (type.equals("objectsAndClassesLab.Students") && day.equals("Saturday")) {
            sum = people * 9.8;
        } else if (type.equals("objectsAndClassesLab.Students") && day.equals("Sunday")) {
            sum = people * 10.46;
        } else if (type.equals("Business") && day.equals("Friday")) {
            sum = people * 10.90;
        } else if (type.equals("Business") && day.equals("Saturday")) {
            sum = people * 15.60;
        } else if (type.equals("Business") && day.equals("Sunday")) {
            sum = people * 16.0;
        } else if (type.equals("Regular") && day.equals("Friday")) {
            sum = people * 15.0;
        } else if (type.equals("Regular") && day.equals("Saturday")) {
            sum = people * 20.0;
        } else if (type.equals("Regular") && day.equals("Sunday")) {
            sum = people * 22.50;
        }

        if (type.equals("objectsAndClassesLab.Students") && people >= 30) {
            sum -= sum * 0.15;
        }
        if (type.equals("Business") && people >= 100) {
            sum -= (people * 10);
        }
        if (type.equals("Regular") && people >= 10 && people <= 20) {
            sum -= sum * 0.95;
        }
        System.out.printf("Total price: %.2f", sum);

    }
}
