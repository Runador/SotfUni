package others;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainListExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];
            int passengers = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Add":
                    wagons.add(passengers);
                    break;

            }







            input = scanner.nextLine();

        }

    }

}
