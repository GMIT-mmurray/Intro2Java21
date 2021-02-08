package ie.gmit.Lesson04.Activity14;

public class Operator extends Object {

  public final String operator;

  public Operator() {
    this("+");
  }

  public Operator(String operator) {
    this.operator = operator;
  }

  public boolean matches(String toCheckFor) {
    return operator.equals(toCheckFor);
  }

  public double operate(double operand1, double operand2) {
    return operand1 + operand2;
  }

}
