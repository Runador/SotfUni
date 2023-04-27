package others;

import java.util.Scanner;

public class CatsDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fatPercent = Double.parseDouble(scanner.nextLine());
        double proteinPercent = Double.parseDouble(scanner.nextLine());
        double carbohydratePercent = Double.parseDouble(scanner.nextLine());
        double caloriesVolume = Double.parseDouble(scanner.nextLine());
        double waterPercent = Double.parseDouble(scanner.nextLine());

        double fatGrams = (fatPercent * caloriesVolume / 100) / 9;
        double proteinGrams = (proteinPercent * caloriesVolume / 100) / 4;
        double carbohydrateGrams = (carbohydratePercent * caloriesVolume / 100) / 4;
        double oneGramCalories = caloriesVolume / (fatGrams + proteinGrams + carbohydrateGrams);
        System.out.println(oneGramCalories);

        double waterPercentOneGramCalories = (waterPercent * oneGramCalories) / 100;
        double foodPercent = oneGramCalories - waterPercentOneGramCalories;
        System.out.printf("%.4f", foodPercent);
    }
}
