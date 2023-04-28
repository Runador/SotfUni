package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        int notGoodGrades = Integer.parseInt(scanner.nextLine());
        int falseCounter = 0;
        boolean isFailed = false;
        double averageScore = 0;
        int sum = 0;
        int counter = 0;
        String last = "";

        String input = scanner.nextLine();

        while (!input.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                falseCounter++;
            }
            if (falseCounter >= notGoodGrades) {
                isFailed = true;
                break;
            }

            counter++;

            sum += grade;
            averageScore = sum / (double) counter;
            last = input;

            input = scanner.nextLine();

        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", falseCounter);
        } else {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", last);
        }

    }

}
