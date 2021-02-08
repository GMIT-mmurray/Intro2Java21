package ie.gmit.Lesson04.Activity14;

public class CalculatorWithFixedOperators {

  private final double operand1;
  private final double operand2;

  // The current operator
  private final Operator operator;

  public CalculatorWithFixedOperators(double operand1, double operand2, String operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;

     // All possible operations
     Division division = new Division();
     Multiplication multiplication = new Multiplication();
     Operator sum = new Operator();
     Subtraction subtraction = new Subtraction();


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
