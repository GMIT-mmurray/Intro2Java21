package ie.gmit.Lesson04.Activity12;

public class Animal  {

  private int legs;
  private int ears;
  private int eyes;
  private String family;
  private String name;

  public Animal() {
    this(4, 2, 2);
  }

  public Animal(int legs, int ears, int eyes) {
    this.legs = legs;
    this.ears = ears;
    this.eyes = ears;
  }

  public Animal(int legs, int ears, int eyes, String family, String name) {
    this.legs = legs;
    this.ears = ears;
    this.eyes = eyes;
    this.family = family;
    this.name = name;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLegs() { return legs; }

  public void setLegs(int legs) { this.legs = legs;
  }
}
