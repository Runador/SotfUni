package arraysLab;

import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArray = scanner.nextLine().split(" ");

        for (int i = 0; i < strArray.length / 2 ; i++) {
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length - 1 - i];
            strArray[strArray.length - 1 - i] = temp;
        }

        System.out.println(String.join(" ", strArray));
    }
}