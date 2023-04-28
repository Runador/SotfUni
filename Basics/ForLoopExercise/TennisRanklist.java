package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        double tournamentAmounts = Double.parseDouble(scanner.nextLine());
        int beginPoints = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double percentWin = 0;
        double percent = 0;

        for (int i = 0; i < tournamentAmounts; i++) {
            String str = scanner.nextLine();
            switch (str) {
                case "W": sum += 2000; break;
                case "F": sum += 1200; break;
                case "SF": sum += 720; break;
            }
            if (str.equals("W")) {
                percentWin++;
            }
            percent = (percentWin / tournamentAmounts) * 100;
        }

        double avg = sum / tournamentAmounts;
        System.out.printf("Final points: %.0f\n", beginPoints + sum);
        System.out.printf("Average points: %.0f\n", Math.floor(avg));
        System.out.printf("%.2f%%", percent);
    }

}
