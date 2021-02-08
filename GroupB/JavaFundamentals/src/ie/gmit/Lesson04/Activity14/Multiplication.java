package ie.gmit.Lesson04.Activity14;

public class Multiplication extends Operator {

  public Multiplication() {
    super("x");
  }

  @Override
  public double operate(double operand1, double operand2) {
    return operand1 * operand2;
  }

}
