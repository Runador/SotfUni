package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> words = new ArrayList<>();
        List<String> firstWords = new ArrayList<>();
        List<String> mirroredWords = new ArrayList<>();
        //@mix#tix3dj#poOl##loOp#wl@@bong&song%4very$long@thong#Part##traP##@@leveL@@Level@##car#rac##tu@pack@@ckap@#rr#sAw##wAs#r#@w1r

        Pattern pattern = Pattern.compile("([#@])(?<pair1>[A-Za-z]{2,}+)(\\1)(\\1)(?<pair2>[A-Za-z]{2,}+)(\\1)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group());
        }

        // #Part##traP#

        for (int i = 0; i < words.size(); i++) {

            String[] wholeWord = words.get(i).split("[\\#@]+");
            String word1 = wholeWord[1];
            String word2 = wholeWord[2];

            String mirroredWord = "";

            for (int j = word1.length() - 1; j >= 0; j--) {
                char symbol = word1.charAt(j);
                mirroredWord += symbol;
            }

            if (mirroredWord.equals(word2)) {
                firstWords.add(word1);
                mirroredWords.add(mirroredWord);
            }
        }

        if (!words.isEmpty()) {
            System.out.printf("%d word pairs found!%n", words.size());
        } else {
            System.out.println("No word pairs found!");
        }

        /* Part <=> traP, leveL <=> Level, sAw <=> wAs */

        if (!mirroredWords.isEmpty()) {
            System.out.println("The mirror words are:");
            for (int i = 0; i < mirroredWords.size(); i++) {
                if (mirroredWords.size() - 1 == i) {
                    System.out.printf("%s <=> %s", firstWords.get(i), mirroredWords.get(i));
                } else {
                    System.out.printf("%s <=> %s, ", firstWords.get(i), mirroredWords.get(i));
                }
            }
        } else {
            System.out.println("No mirror words!");
        }


    }

}
