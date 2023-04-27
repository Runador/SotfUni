package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];
            int element = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Delete":
                    for (int i = 0; i < numbersList.size(); i++) {
                        numbersList.remove(Integer.valueOf(element));
                    }
                    break;
                case "Insert":
                    int position = Integer.parseInt(input.split(" ")[2]);
                    numbersList.add(position, element);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));

    }

}
