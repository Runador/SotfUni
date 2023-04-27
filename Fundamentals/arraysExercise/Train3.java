package arraysExercise;

import java.util.Scanner;

public class Train3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] train = new int[wagons];

        for (int i = 0; i < wagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum+=people;
            train[i] = people;
        }
        for (int people : train) {
            System.out.print(people + " ");
        }
        System.out.println("\n" + sum);
    }
}
