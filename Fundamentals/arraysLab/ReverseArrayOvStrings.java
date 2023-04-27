package arraysLab;

import java.util.Scanner;

public class ReverseArrayOvStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringsArray.length / 2; i++) {
            String first = stringsArray[i];
            stringsArray[i] = stringsArray[stringsArray.length - 1 - i];
            stringsArray[stringsArray.length - 1 - i] = first;
        }

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.print(stringsArray[i] + " ");
        }

    }
}
