package ie.gmit.Lesson04.Activity13;

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("1 + 1 = " + new Calculator(1, 1, "+").operate());
        System.out.println("4 - 2 = " + new Calculator(4, 2, "-").operate());
        System.out.println("1 x 2 = " + new Calculator(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new Calculator(10, 2, "/").operate());
        System.out.println("10 a 2 = " + new Calculator(10, 2, "a").operate());

    }
}
