package objectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger1 = new BigInteger(scanner.nextLine());
        BigInteger bigInteger2 = new BigInteger(scanner.nextLine());

        BigInteger result = bigInteger1.add(bigInteger2);
        System.out.println(result);

    }
}
