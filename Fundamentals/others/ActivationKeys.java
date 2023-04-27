package others;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //abcdefghijklmnopqrstuvwxyz - consist of letters and numbers only.
        //

        String input = scanner.nextLine();
        String rawInputString = input;

        if (isValid(rawInputString)) {

            while (!input.equals("Generate")) {

                String commandString = input;

                if (commandString.contains("Contains")) {
                    String substring = commandString.split(">>>")[1];
                    if (rawInputString.contains(substring)) {
                        System.out.println(rawInputString + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                } else if (commandString.contains("Flip")) {
                    // Flip>>>Upper>>>3>>>14
                    // abgHIjkLMNOPQRstuvwxyz
                    int startIndex = Integer.parseInt(commandString.split(">>>")[2]);
                    int endIndex = Integer.parseInt(commandString.split(">>>")[3]);
                    if (areIndexesValid(rawInputString, startIndex, endIndex)) {
                        if (commandString.contains("Upper")) {
                            String substring = rawInputString.substring(startIndex, endIndex);
                            String upperSubstring = substring.toUpperCase();
                            rawInputString = rawInputString.replace(substring, upperSubstring);
                            System.out.println(rawInputString);
                        } else if (commandString.contains("Lower")) {
                            String substring = rawInputString.substring(startIndex, endIndex);
                            String lowerSubstring = substring.toLowerCase();
                            rawInputString = rawInputString.replace(substring, lowerSubstring);
                            System.out.println(rawInputString);
                        }
                    }
                } else if (commandString.contains("Slice")) {
                    int startIndex = Integer.parseInt(commandString.split(">>>")[1]);
                    int endIndex = Integer.parseInt(commandString.split(">>>")[2]);
                    if (areIndexesValid(rawInputString, startIndex, endIndex)) {
                        String substring = rawInputString.substring(startIndex, endIndex);
                        rawInputString = rawInputString.replace(substring, "");
                        System.out.println(rawInputString);
                    }
                }

                input = scanner.nextLine();
            }
        }

        System.out.printf("Your activation key is: %s", rawInputString);

     }

     public static boolean isValid(String input) {
        boolean isValid = false;
         for (int i = 0; i < input.length(); i++) {
             char symbol = input.charAt(i);
             isValid = Character.isLetter(symbol) || Character.isDigit(symbol);
         }
         return isValid;
     }

     public static boolean areIndexesValid (String input, int startIndex, int endIndex) {
        return startIndex >= 0 && endIndex <= input.length() - 1;
     }

}
