package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            }
            if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        } else {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
