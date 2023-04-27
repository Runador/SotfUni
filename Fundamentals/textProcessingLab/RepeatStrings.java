package textProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        System.out.println(concatenatedStrings(inputArray, inputArray.length));

    }

    public static StringBuilder concatenatedStrings(String[] inputArray, int size) {
        StringBuilder concatenatedString = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String element = inputArray[i];
            concatenatedString.append(element.repeat(element.length()));
        }
        return concatenatedString;
    }

}
