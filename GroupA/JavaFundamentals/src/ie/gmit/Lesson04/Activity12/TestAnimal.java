package ie.gmit.Lesson04.Activity12;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cow = new Animal();
        Animal goat = new Animal();
        Animal duck = new Animal(2, 2, 2);
        Animal dog = new Animal();
        Animal cat = new Animal(4,2,2,"felidae","Ginger" );
        dog.setName("Rex");
        dog.setFamily("Canidae");

        dog.setLegs(3);

        cow.setName("Cow");
        cow.setFamily("Bovidae");

        goat.setName("Goat");
        goat.setFamily("Bovidae");
        duck.setName("Duck");
        duck.setFamily("Anatidae");
        System.out.println(cow.getName());
        System.out.println(goat.getName());
        System.out.println(duck.getFamily());
        System.out.println(dog.getName()+" "+dog.getLegs());
        System.out.println(cat.getName()+" "+cat.getLegs());
    }
}
