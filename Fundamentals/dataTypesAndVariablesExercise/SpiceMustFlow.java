package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalAmount = 0;
        int miningCrew = 26;
        int counter = 0;
        int sum = 0;

        while (startingYield >= 100) {
            counter++;
            sum = startingYield - miningCrew;
            startingYield-=10;
            totalAmount+=sum;
            if (startingYield < 100) {
                totalAmount-=miningCrew;
            }
        }

        System.out.println(counter);
        System.out.println(totalAmount);
    }
}
