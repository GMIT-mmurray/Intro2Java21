package ie.gmit.Lesson03.Activity08;

import java.util.Scanner;

public class PeachBoxCounter {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();

    for (int numShipped = 0; numShipped < numberOfPeaches; numShipped += 20) {
      System.out.printf("shipped %d peaches so far\n", numShipped);
    }

  }
}
