package textProcessingLab;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bannedList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String text = scanner.nextLine();

        for (int i = 0; i < bannedList.size(); i++) {

            String bannedWord = bannedList.get(i);
            String replacement = "";

            for (int j = 0; j < bannedWord.length(); j++) {
                replacement += "*";
            }

            if (text.contains(bannedWord)) {
                text = text.replace(bannedWord, replacement);
            } else {
                break;
            }

        }

        System.out.println(text);

    }

}
