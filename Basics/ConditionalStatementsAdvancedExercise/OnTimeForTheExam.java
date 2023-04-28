package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examSeconds = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalSecond = Integer.parseInt(scanner.nextLine());

        int examAllSeconds = (examHour * 60) + examSeconds;
        int arrivalAllSeconds = (arrivalHour * 60) + arrivalSecond;

        int dif = Math.abs(examAllSeconds - arrivalAllSeconds);

        if (examAllSeconds == arrivalAllSeconds) {
            System.out.println("On time");
        } else if (examAllSeconds - arrivalAllSeconds <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", dif);
        } else if (examAllSeconds - arrivalAllSeconds > 30) {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", dif/60, dif%60);
        } /*else if (arrivalAllSeconds - examAllSeconds < ) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", dif);
        }*/

    }
}
