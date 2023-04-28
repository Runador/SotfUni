package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packetsPens = Integer.parseInt(scanner.nextLine());
        int packetsMarkers = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double sum = (packetsPens * 5.8) + (packetsMarkers * 7.2) + (preparation * 1.2);
        double percent = sum - (sum * percentDiscount / 100);
        System.out.println(percent);
    }
}
