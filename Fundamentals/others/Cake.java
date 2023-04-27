package others;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int result = length * width;
        int sum = 0;
        int dif = 0;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            sum+=pieces;
            dif = Math.abs(result - sum);

            if (sum >= result) {
                System.out.printf("No more cake left! You need %d pieces more.", dif);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", dif);
        }
    }
}
