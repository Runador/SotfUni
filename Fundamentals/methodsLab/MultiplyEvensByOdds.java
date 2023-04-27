package methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvenByOdds(number));
    }

    private static int multiplyEvenByOdds(int number) {
        int sumEven = 0;
        int sumOdd = 0;
        int sum = 0;
        while (number != 0) {
            int dif = number % 10;
            if (dif % 2 == 0) {
                sumOdd+=dif;
            } else {
                sumEven+=dif;
            }
            sum = sumEven * sumOdd;
            number/=10;
        }
        return sum;
    }
}
