package ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double bonusPoints = 0;

        if (num <= 100) {
            bonusPoints = 5;
        } else if (num > 100 && num <= 1000) {
            bonusPoints = num * 0.20;
        } else if (num > 1000) {
            bonusPoints = num * 0.10;
        }
        if (num % 2 == 0) {
            bonusPoints+=1;
        }
        if (num % 10 == 5) {
            bonusPoints+=2;
        }
        System.out.println(bonusPoints);
        System.out.println(num + bonusPoints);
    }
}
