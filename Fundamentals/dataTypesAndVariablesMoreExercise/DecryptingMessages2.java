package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decrypt = "";

        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            symbol+=key;
            decrypt+=symbol;
        }

        System.out.println(decrypt);
    }
}
