package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesТoCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double enteredInches = Double.parseDouble(sc.nextLine());
        System.out.println(enteredInches * 2.54);
    }

    /*Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри. За
целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).*/
}
