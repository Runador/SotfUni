package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] randomArr = input.split(" ");

        Random random = new Random();

        for (int i=0; i < randomArr.length; i++) {
            int index = random.nextInt(randomArr.length);

        }
    }
}
