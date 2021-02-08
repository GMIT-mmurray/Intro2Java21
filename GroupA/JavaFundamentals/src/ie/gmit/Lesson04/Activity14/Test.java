package ie.gmit.Lesson04.Activity14;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        CalculatorWithFixedOperators c =  new CalculatorWithFixedOperators(1, 1, "+");
        Double d = c.operate();
        System.out.println("1 + 1 = " + d);

        CalculatorWithFixedOperators c1 =  new CalculatorWithFixedOperators(4, 2, "/");
        d = c1.operate();
        System.out.println("4 / 2 = " + d);

        System.out.println("4 - 2 = " + new CalculatorWithFixedOperators(4, 2, "-").operate());
        System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());


        Date date = new Date();
        String dateString = date.toString();
        System.out.println(dateString);
        System.out.println(date);


    }
}
