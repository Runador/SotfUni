package dataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal bigDecimal1 = new BigDecimal(0);

        while (n!=0) {
            String input = scanner.nextLine();
            BigDecimal bigDecimal2 = new BigDecimal(Double.parseDouble(input));
            bigDecimal1 = bigDecimal1.add(bigDecimal2);
            n--;
        }
        System.out.println(bigDecimal1);
    }
}
