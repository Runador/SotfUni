package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputArray = scanner.nextLine().split(" ");
            String add = inputArray[0];
            int passengers = Integer.parseInt(inputArray[1]);

            if (inputArray[0].equals("Add")) {

            }

            input = scanner.nextLine();
        }


    }
}
