package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        double record = Double.parseDouble(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        double oneMeterInSeconds = Double.parseDouble(scanner.nextLine());

        double allSeconds = distance * oneMeterInSeconds;
        double resistance = (double) (distance / 15) * 12.5;  // сопротивление
        double timeWithResistance = allSeconds + resistance;
        double difference = timeWithResistance - record;

        if (timeWithResistance > record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeWithResistance);
        }
    }
}
