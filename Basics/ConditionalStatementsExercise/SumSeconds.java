package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        if ((timeFirst >= 1 && timeFirst <= 50) || (timeSecond >= 1 && timeSecond <= 50) ||
                (timeThird >= 1 && timeThird <= 50)) {
            int sum = (timeFirst + timeSecond + timeThird);
            int seconds = sum % 60;
            if (seconds >= 0 && seconds <= 9) {
                System.out.printf((sum / 60) + ":0" +seconds);
            } else {
                System.out.printf((sum / 60) + ":" +seconds);
            }
        } else {
            System.out.println("Error!");
        }
    }
}
