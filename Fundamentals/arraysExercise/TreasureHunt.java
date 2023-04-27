package arraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLootList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        List<String> droppedLoot = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {

            String[] inputArray = command.split(" ");
            String commandInput = inputArray[0];

            switch (commandInput) {

                case "Loot":
                    //Loot {item1} {item2}…{itemn}
                    //Pick up treasure loot along the way. Insert the items at the beginning of the chest.
                    // If an item is already contained, don't insert it.

                    for (int element = 1; element < inputArray.length; element++) {

                        if (!initialLootList.contains(inputArray[element])) {
                            initialLootList.add(0, inputArray[element]);
                        }
                    }

                    break;

                case "Drop":
                    //Remove the loot at the given position and add it to the end of the treasure chest.
                    //If the index is invalid, skip the command.

                    int position = Integer.parseInt(inputArray[1]);

                    if (position >= 0 && position <= initialLootList.size()) {
                        String elementAtPosition = initialLootList.get(position);
                        initialLootList.remove(position);
                        initialLootList.add(elementAtPosition);
                    }
                    break;

                case "Steal":
                    //Someone steals the last count loot items. If there are fewer items than the given count,
                    // remove as many as there are.
                    //Print the stolen items separated by ", "
                    //Pistol others.Coins Wood Silver Bronze Medallion Cup Gold
                    //removes the last 3 items Medallion, Cup, Gold

                    int count = Integer.parseInt(inputArray[1]);

                    for (int i = 0; i < count; i++) {
                        if (initialLootList.size() <= count) {
                            for (int  j = 0; j < initialLootList.size(); j++) {
                                if (j != initialLootList.size() - 1) {
                                    System.out.print(initialLootList.get(j) + ", ");
                                } else {
                                    System.out.print(initialLootList.get(j));
                                }
                            }
                            initialLootList.clear();
                        } else {
                            droppedLoot.add(0, initialLootList.get(initialLootList.size() - 1));
                            initialLootList.remove(initialLootList.size() - 1);
                        }
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < droppedLoot.size(); i++) {
            if (i != droppedLoot.size() - 1) {
                System.out.print(droppedLoot.get(i) + ", ");
            } else {
                System.out.print(droppedLoot.get(i));
            }
        }

        System.out.println();
        double sum = 0;
        double result;

        for (int i = 0; i < initialLootList.size(); i++) {
            sum += initialLootList.get(i).length();
        }
        result = sum / initialLootList.size();

        if (!initialLootList.isEmpty()) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", result);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
