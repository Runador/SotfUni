package listsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            if (numbersList.get(i).equals(numbersList.get(i + 1))) {
                numbersList.set(i, numbersList.get(i) + numbersList.get(i + 1));
                numbersList.remove(numbersList.get(i + 1));
                i = -1;
            }
        }

        for (double element : numbersList) {
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            System.out.print(decimalFormat.format(element) + " ");
        }

    }
}
