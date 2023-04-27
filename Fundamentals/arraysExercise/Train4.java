package arraysExercise;

import java.util.Scanner;

public class Train4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int train[] = new int[wagons];
        int sum = 0;

        for (int wagon = 0; wagon < wagons; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            train[wagon] = people;
            sum+=people;
        }

        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println("\n" + sum);
    }
}
