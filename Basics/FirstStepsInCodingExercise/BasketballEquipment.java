package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxPerYear = Integer.parseInt(scanner.nextLine());
        double sneakers = taxPerYear - (taxPerYear * 40) / 100;
        double sportsSuit = sneakers - ((sneakers * 20) / 100);
        double ball = sportsSuit / 4;
        double accessories = ball / 5;
        double allConsumptions = taxPerYear + sneakers + sportsSuit + ball + accessories;
        System.out.println(allConsumptions);
    }
}
