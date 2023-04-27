package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char s = str.charAt(i);
            sb.append(s);
        }
        System.out.println(sb);
    }
}
