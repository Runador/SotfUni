package methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1, num2));
        } else if (type.equals("char")) {
            char ch1 = scanner.nextLine().charAt(0);
            char ch2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(ch1, ch2));
        } else if (type.equals("string")) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(getMax(str1, str2));
        }
    }

    private static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    private static char getMax(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        } else {
            return ch2;
        }
    }

    private static String getMax(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return str1;
        } else {
            return str2;
        }
    }

}
