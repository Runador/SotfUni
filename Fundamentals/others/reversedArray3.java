package others;

import java.util.Scanner;

public class reversedArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArr = scanner.nextLine().split("\\s");
        String[] reversedArr = new String[stringsArr.length];

        for (int i = 0; i < stringsArr.length; i++) {
            String oldElement = stringsArr[i];
            stringsArr[i] = stringsArr[stringsArr.length - 1 - i];
            stringsArr[stringsArr.length - 1 - i] = oldElement;
            reversedArr[i] = stringsArr[i];
        }

        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}

/*Write a program to read an array of strings, reverse it and print its elements.
The input consists of a sequence of space-separated strings. Print the output on a single line (space separated).
 */