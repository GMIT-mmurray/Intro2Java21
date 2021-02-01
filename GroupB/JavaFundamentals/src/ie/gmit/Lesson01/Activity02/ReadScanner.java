package ie.gmit.Lesson01.Activity02;


import java.util.Scanner;

public class ReadScanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double a = sc.nextDouble();
    System.out.print("Enter 2nd number: ");
    double b = sc.nextDouble();
    System.out.println("The sum is " + (a + b) + ".");

  }
}
