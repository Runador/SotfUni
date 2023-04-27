package listsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();

        int minimalSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minimalSize; i++) {
            int firstElement = firstList.get(i);
            int secondElement = secondList.get(i);
            mergedList.add(firstElement);
            mergedList.add(secondElement);
        }

        if (firstList.size() > secondList.size()) {
            mergedList.addAll(firstList.subList(minimalSize, firstList.size()));
        } else {
            secondList.subList(minimalSize, secondList.size());
            mergedList.addAll(secondList.subList(minimalSize, secondList.size()));
        }

        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));

    }

}
