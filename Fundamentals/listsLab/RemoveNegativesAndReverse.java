package listsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size(); i++) {
            int index = numbersList.get(i);
            //numbersList.removeIf(e -> index < 0);
            if (index < 0) {
                numbersList.remove(i);
                i = -1;
            }
        }

        if (numbersList.isEmpty()) {
            System.out.println("empty");
        }
        Collections.reverse(numbersList);

        for (int element : numbersList) {
            System.out.print(element + " ");
        }

    }

}
