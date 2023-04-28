package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String typeOfPlacement = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0;
        double sum = 0;
        double promotion = 0;

        switch (typeOfPlacement) {
            case "room for one person":
                price = 18.0;
                sum = price * nights;
                if (days < 10) {
                    if (grade.equals("positive")) {
                        double result = sum * 0.25;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = sum * 0.10;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else if (days <= 15) {
                    if (grade.equals("positive")) {
                        double result = sum * 0.25;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = sum * 0.10;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else {
                    if (grade.equals("positive")) {
                        double result = sum * 0.25;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = sum * 0.10;
                        sum += result;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                }
                break;
            case "apartment":
                price = 25.0;
                sum = price * nights;
                if (days < 10) {
                    promotion = sum - (sum * 0.30);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        sum -= promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else if (days <= 15) {
                    promotion = sum - (sum * 0.35);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        sum -= promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else {
                    promotion = sum - (sum * 0.50);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        sum -= promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                }
                break;
            case "president apartment":
                price = 35.0;
                sum = price * nights;
                if (days < 10) {
                    promotion = sum - (sum * 0.10);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        sum -= promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else if (days <= 15) {
                    promotion = sum - (sum * 0.15);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        sum -= promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                } else {
                    promotion = sum - (sum * 0.20);
                    sum -= promotion;
                    if (grade.equals("positive")) {
                        double result = promotion * 0.25;
                        sum = result + promotion;
                        System.out.printf("%.2f", Math.abs(sum));
                    } else if (grade.equals("negative")) {
                        double result = promotion * 0.10;
                        sum = result - promotion;
                        promotion -= sum;
                        System.out.printf("%.2f", Math.abs(sum));
                    }
                }
                break;
        }
    }

}

/*Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче, трябва да резервира
хотел и да изчисли колко ще му струва престоя. Налични са следните видове помещения, със следните цени за престой:
            ▪ "room for one person" – 18.00 лв за нощувка
            ▪ "apartment" – 25.00 лв за нощувка
            ▪ "president apartment" – 35.00 лв за нощувка
Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението, което ще избере,
той може да ползва различно намаление.

След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея. Ако оценката му е негативна
приспада от цената 10%.*/