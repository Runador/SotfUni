package others;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Hawai::Cyprys-Greece
        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String command = input.split(":")[0];

            switch (command) {
                case "Add Stop":
                    //Add Stop:{index}:{string}
                    int index = Integer.parseInt(input.split(":")[1]);
                    String stop = input.split(":")[2];
                    if (isValidIndex(index, stopsBuilder)) {
                        stopsBuilder.insert(index, stop);
                    }
                    break;
                case "Remove Stop":
                    //Remove Stop:{start_index}:{end_index}
                    int startIndex = Integer.parseInt(input.split(":")[1]);
                    int endIndex = Integer.parseInt(input.split(":")[2]);
                    if (isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)) {
                        stopsBuilder.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    //Switch:{old_string}:{new_string}
                    String oldString = input.split(":")[1];
                    String newString = input.split(":")[2];
                    if (stopsBuilder.toString().contains(oldString)) {
                        String updatedText = stopsBuilder.toString().replace(oldString, newString);
                        stopsBuilder = new StringBuilder(updatedText);
                    }
                    break;
            }
            System.out.println(stopsBuilder);
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stopsBuilder);

    }

    public static boolean isValidIndex(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;
    }

}

