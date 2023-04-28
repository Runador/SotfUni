package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String name = input;
        int countClass = 0;
        int countFail = 0;
        double sum = 0;
        boolean isExcluded = false;

        while (countClass != 12) {

            double num = Double.parseDouble(scanner.nextLine());

            if (num >= 4.0) {
                sum+=num;
                countClass++;
            } else {
                countFail++;
                if (countFail > 1) {
                    countClass++;
                    isExcluded = true;
                    break;
                }
            }
        }

        double average = sum / countClass;

        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, countClass);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);

        }
    }

}
