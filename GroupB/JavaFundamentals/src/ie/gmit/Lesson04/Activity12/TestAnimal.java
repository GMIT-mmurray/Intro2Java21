package ie.gmit.Lesson04.Activity12;

public class TestAnimal {

    public static void main(String[] args) {
        Animal cow = new Animal();
        Animal goat = new Animal();
        Animal duck = new Animal(2, 2, 2);
        Animal cat = new Animal(4, 2, 2,"Felidea","theCat");


        cow.setName("Cow");
        cow.setFamily("Bovidae");

        goat.setName("Goat");
        goat.setFamily("Bovidae");

        duck.setName("Duck");
        duck.setFamily("Anatidae");

        cat.setLegs(3);
        System.out.println(cow);
        System.out.println(cat);
        System.out.println(cow.getName());
        System.out.println(goat.getName());
        System.out.println(duck.getFamily());

    }

}
