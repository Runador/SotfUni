package others;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        while (sum != 10000) {
            int steps = Integer.parseInt(input);

            sum+=steps;
            int dif = Math.abs(sum - 10000);

            if (sum >= 1000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", dif);
                break;
            }

            if (input.equals("Going home")) {
                steps = Integer.parseInt(input);
                sum+=steps;
                System.out.printf("%d more steps to reach goal.", dif);
            }

            input = scanner.nextLine();
        }

    }
}
