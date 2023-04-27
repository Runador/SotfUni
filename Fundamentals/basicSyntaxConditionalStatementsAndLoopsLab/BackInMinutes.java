package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackInMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int sum = hours * 60 + minutes + 30;
        int hoursAfter = sum / 60;
        int minutesAfter = sum % 60;

        if ((hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)) {
            if (hoursAfter > 23) {
                hoursAfter = 0;
            }
            if (minutesAfter >= 10) {
                System.out.printf("%d:%d", hoursAfter, minutesAfter);
            } else {
                System.out.printf("%d:0%d", hoursAfter, minutesAfter);
            }
        }
    }
}
