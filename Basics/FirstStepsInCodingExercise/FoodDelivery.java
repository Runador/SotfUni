package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());
        double sumAllMenus = chickenMenus * 10.35 + fishMenus * 12.40 + veganMenus * 8.15;
        double desert = sumAllMenus * 0.20;
        double allSum = sumAllMenus + desert + 2.50;
        System.out.println(allSum);
    }
}
