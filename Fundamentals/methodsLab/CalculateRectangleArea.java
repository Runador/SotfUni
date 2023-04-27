package methodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fullName(scanner));
    }

    private static String fullName(Scanner scanner) {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        return firstName + " " + lastName;
    }


}
