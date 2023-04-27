package objectsAndClassesLab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> words = Arrays.stream(input.split(" ")).collect(Collectors.toList());

        for (int i = 0; i < words.size(); i++) {
            Random random = new Random();
            int randomItem = random.nextInt(words.size());
            String randomElement = words.get(randomItem);
            System.out.println(randomElement);
        }

    }
}
