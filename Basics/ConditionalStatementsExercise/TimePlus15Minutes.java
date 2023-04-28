package ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allTime = hours * 60 + minutes + 15;
        int hoursAfter = allTime / 60;
        int minutesAfter = allTime % 60;

        if (hoursAfter > 23) {
            hoursAfter = 0;
        }
        if (hours >= 0 && hours <= 23) {
            if (minutes >= 0 && minutes <= 59) {
                if (minutesAfter > 9) {
                    System.out.printf("%d:%d", hoursAfter, minutesAfter);
                } else {
                    System.out.printf("%d:0%d", hoursAfter, minutesAfter);
                }
            }
        }
    }
}
