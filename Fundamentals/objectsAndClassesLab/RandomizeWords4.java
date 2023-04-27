package objectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Random random = new Random();
        int rnd = random.nextInt(words.size());

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(rnd));
            words.remove(i);
        }

    }
}
