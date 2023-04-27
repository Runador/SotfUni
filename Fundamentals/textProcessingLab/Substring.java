package textProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        //ice              kgb
        //kicegiciceeb
        for (int i = 0; i < secondString.length(); i++) {
            if (secondString.contains(firstString)) {
                secondString = secondString.replace(firstString, "");
            } else {
                System.out.println(secondString);
                break;
            }
        }
    }
}
