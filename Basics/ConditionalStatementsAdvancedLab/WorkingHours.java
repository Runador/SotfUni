package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (hour >= 10 && hour <= 18) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                    || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
