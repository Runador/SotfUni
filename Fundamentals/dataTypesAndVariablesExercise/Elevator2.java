package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int whole = persons / capacity;
        int reminder = persons % capacity;

        if (capacity >= reminder && reminder != 0) {
            whole += 1;
        }

        System.out.println(whole);
    }
}
