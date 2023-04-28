package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double sumOfAgeMoney = 0;
        double sum = 0;
        int countToys = 0;
        double sumForToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sumOfAgeMoney += 10;
                sum += sumOfAgeMoney;
                sum -= 1;
            } else {
                countToys++;
                sumForToys = countToys * toyPrice;
            }
        }


        double dif = Math.abs((sum + sumForToys) - washingMachinePrice);

        if ((sum + sumForToys) >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", dif);
        } else {
            System.out.printf("No! %.2f", dif);
        }

    }
}
