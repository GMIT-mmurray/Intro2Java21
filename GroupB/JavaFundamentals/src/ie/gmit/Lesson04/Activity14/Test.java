package ie.gmit.Lesson04.Activity14;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        CalculatorWithFixedOperators c = new CalculatorWithFixedOperators(1, 1, "+");
        Double result = c.operate();
        System.out.println("1 + 1 = " + result);

        CalculatorWithFixedOperators c1 = new CalculatorWithFixedOperators(4, 2, "-");
        result = c1.operate();
        System.out.println("4 - 2 = " + result);

        System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());
        Date date = new Date();
        String stringDate = date.toString();

    }
}
