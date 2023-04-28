package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isOk = false;

        while (n != 0) {
            String site = scanner.nextLine();

            if (site.equals("Facebook")) {
                salary-=150;
            } else if (site.equals("Instagram")) {
                salary-=100;
            } else if (site.equals("Reddit")) {
                salary-=50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
            n--;
        }
        if (salary > 0) {
            System.out.println(salary);
        }

    }
}
