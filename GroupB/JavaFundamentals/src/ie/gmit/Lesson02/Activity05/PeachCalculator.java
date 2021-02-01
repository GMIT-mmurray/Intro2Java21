package ie.gmit.Lesson02.Activity05;

import java.util.Scanner;

public class PeachCalculator {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();
    int numberOfFullBoxes = numberOfPeaches / 20;
    int numberOfPeachesLeft = numberOfPeaches - numberOfFullBoxes * 20;
    System.out.printf("We have %d full boxes and %d peaches left.", numberOfFullBoxes, numberOfPeachesLeft);
  }

}
