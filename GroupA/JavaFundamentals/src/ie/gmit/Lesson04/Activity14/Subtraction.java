package ie.gmit.Lesson04.Activity14;

public class Subtraction extends Operator {

  public Subtraction() {
    super("-");
  }

  @Override
  public double operate(double operand1, double operand2) {
    return operand1 - operand2;
  }

}
