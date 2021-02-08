package ie.gmit.Lesson04.Exercise11;

public class Person {
  // Properties
private   int age;
private   int height;
private   String name;

  // Methods
  public void walk() {
    // Do walking operations here
    System.out.println("Walking...");
  }

  public void sleep() {
    // Do sleeping operations here
    System.out.println("Sleeping...");
  }

  private void takeShower() {
    // Do take shower operations here
    System.out.println("Taking a shower...");
  }

  public void walk(int speed) {
    // Do walking operations here
    if (speed > 10) {
      System.out.println("Walking...");
    }
  }

  public static void main(String[] args) {
    Person me = new Person();
    Person myNeighbour = new Person();
    Person lecturer = new Person();
    me.sleep();
    me.takeShower();
  }
}