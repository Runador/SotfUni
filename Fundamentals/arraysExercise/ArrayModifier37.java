package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.equals("decrease")) {
                for (int i = 0; i < numbersArray.length; i++) {
                    numbersArray[i] -= 1;
                }
            } else {
                String[] stringsArray = input.split(" ");
                String command = stringsArray[0];
                int first = Integer.parseInt(stringsArray[1]);
                int second = Integer.parseInt(stringsArray[2]);

                switch (command) {
                    case "swap":
                        int temp = numbersArray[first];
                        numbersArray[first] = numbersArray[second];
                        numbersArray[second] = temp;
                        break;
                    case "multiply":
                        numbersArray[first] = numbersArray[first] * numbersArray[second];
                        break;
                }
            }

            input = scanner.nextLine();
        }

        /*for (int i = 0; i < numbersArray.length; i++) {
            if (i == numbersArray.length - 1) {
                System.out.print(numbersArray[i] + "");
            } else {
                System.out.print(numbersArray[i] + ", ");
            }
        }*/

        System.out.print(Arrays.toString(numbersArray).replace("[", "").replace("]", ""));

    }
}
