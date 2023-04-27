package others;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {

        /*int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int[] others.numbers = new int[3];

        others.numbers[0] = num1;
        others.numbers[1] = num2;
        others.numbers[2] = num3;

        int j = 0;
        System.out.println(others.numbers[j]);

        for (int i = 0; i < others.numbers.length; i++) {
            System.out.println(others.numbers[i]);
        }*/
        /*System.out.println(others.numbers[0]);
        System.out.println(num2);
        System.out.println(num3);*/

        /*int[] numbers1 = new int[3];
        int[] numbers2 = new int[4];
        int[] numbers3 = new int[numbers1.length + numbers2.length];
        System.out.println(numbers3.length);*/


        /*int[] others.numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEven = 0;

        for (int i = 0; i < others.numbers.length; i++) {
            if (others.numbers[i] % 2 == 0) {
                sumEven+=others.numbers[i];
            }
        }
        System.out.println(sumEven);*/


        /*Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringArray.length / 2; i++) {
            String firstElement = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = firstElement;
        }

        System.out.println(String.join(" ", stringArray));*/




        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean areIdentical = false;
        int element = 0;
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sum+=firstArray[i];
                areIdentical = true;
            } else {
                element = i;
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", element);
        }

    }
}
