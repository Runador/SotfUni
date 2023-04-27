package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] inputElements = input.split(" ");

            if (inputElements[0].equals("swap")) {

                int firstNumber = Integer.parseInt(inputElements[1]);
                int secondNumber = Integer.parseInt(inputElements[2]);

                    int temp = integerArray[firstNumber];
                    integerArray[firstNumber] = integerArray[secondNumber];
                    integerArray[secondNumber] = temp;
            }

            if (inputElements[0].equals("multiply")) {

                int firstNumber = Integer.parseInt(inputElements[1]);
                int secondNumber = Integer.parseInt(inputElements[2]);

                    int first = integerArray[firstNumber];
                    int second = integerArray[secondNumber];

                    int temp = first * second;
                    integerArray[firstNumber] = temp;
            }

            if (inputElements[0].equals("decrease")) {

                for (int i = 0; i < integerArray.length; i++) {
                    integerArray[i] -= 1;
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < integerArray.length; i++) {
            int lastElement = integerArray.length - 1;
            if (lastElement == i) {
                System.out.print(integerArray[i] + "");
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }

        String[] array = Arrays.toString(integerArray).split("[\\[\\]]")[1].split(", ");
        System.out.println(String.join(", ", array));

    }
}
