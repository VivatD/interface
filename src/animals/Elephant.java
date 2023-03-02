package animals;

public class Elephant extends Herbivore implements Animal{


    @Override
    public void sleep() {
        Animal.super.sleep();
    }

    @Override
    public void getAge(int age) {
        System.out.println("Age: " + age);
    }

    @Override
    public void getName(String name) {
        System.out.println("Elephant: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Eating vegetables");
    }
}
