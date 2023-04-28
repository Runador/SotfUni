package ConditionalStatementsLab;

import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 100) {
            System.out.println("Less than 100");
        } else if ((100 <= num) && (num <= 200)) {
            System.out.println("Between 100 and 200");
        } else if (200 < num){
            System.out.println("Greater than 200");
        }
    }
}
