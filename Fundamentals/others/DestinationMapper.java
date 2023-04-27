package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        List<String> validDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("([\\/\\=])(?<stop>[A-Z][A-Za-z]{2,}+)(\\1)");
        Matcher matcher = pattern.matcher(places);

        while (matcher.find()) {
            validDestinations.add(matcher.group("stop"));
        }

        int travelPoints = 0;

        System.out.print("Destinations: ");
        for (int i = 0; i < validDestinations.size(); i++) {
            String validDestination = validDestinations.get(i);
            travelPoints += validDestination.length();
            if (validDestinations.size() - 1 == i) {
                System.out.print(validDestinations.get(i));
            } else {
                System.out.print(validDestinations.get(i) + ", ");
            }

        }

        // "Destinations: {destinations joined by ', '}
        // Travel Points: {travel_points}
        System.out.println();
        System.out.printf("Travel Points: %d", travelPoints);

    }

}
