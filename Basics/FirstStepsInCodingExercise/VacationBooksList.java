package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerOneHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = amountOfPages / pagesPerOneHour / days;
        System.out.println(hoursPerDay);
    }
}
