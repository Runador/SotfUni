package methodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, n));
    }

    private static String repeatString(String input, int count) {
        String repeatedString = "";
        for (int i = 0; i < count; i++) {
            repeatedString += "" + input;
        }
        return repeatedString;
    }

}
