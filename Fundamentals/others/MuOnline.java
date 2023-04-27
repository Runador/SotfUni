package others;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;

        String[] dungeonsRoom = scanner.nextLine().split("\\|");

        for (int room = 0; room < dungeonsRoom.length; room++) {
            String[] roomString = dungeonsRoom[room].split(" ");

            String command = roomString[0];
            int number = Integer.parseInt(roomString[1]);

            switch (command) {
                case "potion":
                    if (initialHealth > 0 && initialHealth <= 100) {
                        int reminder = 100 - initialHealth;
                        if (number + initialHealth > 100) {
                            initialHealth = 100;
                            System.out.printf("You healed for %d hp.%n", reminder);
                        } else {
                            initialHealth += number;
                            System.out.printf("You healed for %d hp.%n", number);
                        }

                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    break;
                case "chest":
                    initialBitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    if (initialHealth > 0 && initialHealth > number) {
                        initialHealth -= number;
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", room + 1);
                        return;
                    }
            }

        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", initialBitcoins);
        System.out.printf("Health: %d", initialHealth);

        /*String command = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());*/

        // rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest

    }

}
