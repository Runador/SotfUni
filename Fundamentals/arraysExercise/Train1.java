package arraysExercise;

import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];
        int sumPeople = 0;

        for (int wagon = 0; wagon < wagons; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            train[wagon] = people;
            sumPeople+=people;
        }

        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i] + " ");
        }

        System.out.println("\n" + sumPeople);
    }
}
