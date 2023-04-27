package regularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexInput = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(regexInput);

        for (int i = 0; i < regexInput.length(); i++) {
            if (matcher.find()) {
                System.out.print(matcher.group() + " ");
            }
        }

    }

}
