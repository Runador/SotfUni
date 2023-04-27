package arraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }

        for (String element : inputArr) {
            System.out.print(element + " ");
        }
    }
}
