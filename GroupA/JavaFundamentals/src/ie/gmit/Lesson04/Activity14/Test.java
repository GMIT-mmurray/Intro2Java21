package ie.gmit.Lesson04.Activity14;

public class Test {
    public static void main(String[] args) {

        CalculatorWithFixedOperators c =  new CalculatorWithFixedOperators(1, 1, "+");
        Double d = c.operate();
        System.out.println("1 + 1 = " + d);


        System.out.println("4 - 2 = " + new CalculatorWithFixedOperators(4, 2, "-").operate());
        System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());
    }
}
