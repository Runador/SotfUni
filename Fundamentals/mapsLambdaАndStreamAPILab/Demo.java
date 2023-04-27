package mapsLambdaАndStreamAPILab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new TreeMap<>();
        map.put("Sergey", 1233456);
        map.put("Runador", 12314);
        map.put("Evgeny", 123234);

        map.remove("Evgeny");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d", entry.getKey(), entry.getValue());
        }
    }
}
