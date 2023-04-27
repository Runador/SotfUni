package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];
            int number = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Add":
                    numbersList.add(number);
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbersList.remove(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split(" ")[2]);
                    numbersList.add(index, number);
                    break;
            }

            input = scanner.nextLine();

        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));

    }
}
