package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentprice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.0 * days;
            apartmentprice = 65.0 * days;
            if (days > 7 && days <= 14) {
                studioPrice -= (studioPrice * 0.05);
            } else if (days > 14) {
                studioPrice -= (studioPrice * 0.30);
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20 * days;
            apartmentprice = 68.70 * days;
            if (days > 14) {
                studioPrice -= (studioPrice * 0.20);
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76.0 * days;
            apartmentprice = 77.0 * days;
        }
        if (days > 14) {
            apartmentprice -= (apartmentprice * 0.10);
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentprice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }

}
