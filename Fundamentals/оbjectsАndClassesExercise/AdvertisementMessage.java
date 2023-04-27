package оbjectsАndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        List<String> phrasesList = new ArrayList<>();
        List<String> eventsList = new ArrayList<>();
        List<String> authorsList = new ArrayList<>();
        List<String> citiesList = new ArrayList<>();

        String phrases = "Excellent product.Such a great product.I always use that product." +
                "Best product of its category.Exceptional product.I can’t live without this product.";

        for (int i = 0; i < phrases.length(); i++) {
            String phrase1 = phrases.split("\\.")[0];
            String phrase2 = phrases.split("\\.")[1];
            String phrase3 = phrases.split("\\.")[2];
            String phrase4 = phrases.split("\\.")[3];
            String phrase5 = phrases.split("\\.")[4];
            String phrase6 = phrases.split("\\.")[5];
            phrasesList.add(phrase1);
            phrasesList.add(phrase2);
            phrasesList.add(phrase3);
            phrasesList.add(phrase4);
            phrasesList.add(phrase5);
            phrasesList.add(phrase6);
        }

        String events = "Now I feel good.I have succeeded with this product.Makes miracles. I am happy of the results!";


        for (int i = 1; i <= numberOfMessages; i++) {

        }

    }

}
