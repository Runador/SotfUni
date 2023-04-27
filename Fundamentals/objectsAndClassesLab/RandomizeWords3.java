package objectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringsList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!stringsList.isEmpty()) {

            Random random = new Random();

            int randomIndex = random.nextInt(stringsList.size());
            String word = stringsList.get(randomIndex);
            System.out.println(word);
            stringsList.remove(word);

        }

    }
}
