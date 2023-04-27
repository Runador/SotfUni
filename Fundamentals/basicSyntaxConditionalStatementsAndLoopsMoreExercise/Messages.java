package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String word = "";

        while (input != 0) {
            String symbol = "";
            int number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case 2: symbol = "a"; word+=symbol; break;
                case 22: symbol = "b"; word+=symbol; break;
                case 222: symbol = "c"; word+=symbol; break;
                case 3: symbol = "d"; word+=symbol; break;
                case 33: symbol = "e"; word+=symbol; break;
                case 333: symbol = "f"; word+=symbol; break;
                case 4: symbol = "g"; word+=symbol; break;
                case 44: symbol = "h"; word+=symbol; break;
                case 444: symbol = "i"; word+=symbol; break;
                case 5: symbol = "j"; word+=symbol; break;
                case 55: symbol = "k"; word+=symbol; break;
                case 555: symbol = "l"; word+=symbol; break;
                case 6: symbol = "m"; word+=symbol; break;
                case 66: symbol = "n"; word+=symbol; break;
                case 666: symbol = "o"; word+=symbol; break;
                case 7: symbol = "p"; word+=symbol; break;
                case 77: symbol = "q"; word+=symbol; break;
                case 777: symbol = "r"; word+=symbol; break;
                case 7777: symbol = "s"; word+=symbol; break;
                case 8: symbol = "t"; word+=symbol; break;
                case 88: symbol = "u"; word+=symbol; break;
                case 888: symbol = "v"; word+=symbol; break;
                case 9: symbol = "w"; word+=symbol; break;
                case 99: symbol = "x"; word+=symbol; break;
                case 999: symbol = "y"; word+=symbol; break;
                case 9999: symbol = "z"; word+=symbol; break;
                case 0: symbol = " "; word+=symbol; break;
            }
            input--;
        }
        System.out.println(word);
    }
}
