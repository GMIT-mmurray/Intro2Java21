package ie.gmit.Lesson04.Activity14;

public class CalculatorWithFixedOperators {

  private final double operand1;
  private final double operand2;

  // The current operator
  private final Operator operator;

  // All possible operations
  private final Division division = new Division();
  private final Multiplication multiplication = new Multiplication();
  private final Operator sum = new Operator();
  private final Subtraction subtraction = new Subtraction();


  public CalculatorWithFixedOperators(double operand1, double operand2, String operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;

    if (subtraction.matches(operator)) {
      this.operator = subtraction;
    } else if (multiplication.matches(operator)) {
      this.operator = multiplication;
    } else if (division.matches(operator)) {
      this.operator = division;
    } else {
      this.operator = sum;
    }
  }

  public double operate() {
    return operator.operate(operand1, operand2);
  }

}
