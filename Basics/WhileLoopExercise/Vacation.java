package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyInTheMoment = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        String input = scanner.nextLine();

        while (counter != 5) {
            if (input.equals("spend")) {
                double spend = Double.parseDouble(scanner.nextLine());
                counter++;
                if (spend > moneyInTheMoment) {
                    moneyInTheMoment = 0;
                } else {
                    moneyInTheMoment -= spend;
                }
            }
            if (input.equals("save")) {
                double save = Double.parseDouble(scanner.nextLine());
                counter++;
                moneyInTheMoment += save;
                if (neededMoney <= moneyInTheMoment) {
                    System.out.printf("You saved the money for %d days.", counter);
                    break;
                }
            }
            if (counter == 5) {
                System.out.println("You can't save the money.");
                System.out.println(counter);
                break;
            }
            input = scanner.nextLine();
        }

    }
}
