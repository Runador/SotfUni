package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String command = input.split(" ")[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(input.split(" ")[1]);
                    for (int element : numbersList) {
                        if (numbersList.contains(number)) {
                            System.out.println("Yes");
                            break;
                        } else {
                            System.out.println("No such number");
                            break;
                        }
                    }
                    break;
                case "Print":
                    String secondCommand = input.split(" ")[1];
                    switch (secondCommand) {
                        case "even":
                            for (int element : numbersList) {
                                if (element % 2 == 0) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                        case "odd":
                            System.out.println();
                            for (int element : numbersList) {
                                if (element % 2 == 1) {
                                    System.out.print(element + " ");
                                }
                            }
                            break;
                    }
                    break;
                case "Get":
                    String sumInput = input.split(" ")[1];
                    switch (sumInput) {
                        case "sum":
                            int sum = 0;
                            for (int i = 0; i < numbersList.size(); i++) {
                                sum += numbersList.get(i);
                            }
                            System.out.println();
                            System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String condition = input.split(" ")[1];
                    int conditionNumber = Integer.parseInt(input.split(" ")[2]);

                    switch (condition) {
                        case ">":
                            for (int element : numbersList) {
                                if (element > conditionNumber) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<":
                            for (int element : numbersList) {
                                if (element < conditionNumber) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int element : numbersList) {
                                if (element >= conditionNumber) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int element : numbersList) {
                                if (element <= conditionNumber) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
                    input = scanner.nextLine();

            }

    }

}
