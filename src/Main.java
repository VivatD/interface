import animals.Animal;
import animals.Elephant;
import animals.Herbivore;

import static animals.Animal.move;

public class Main {

    public static void main(String[] args) {

        Animal elephant = new Elephant();

        elephant.getName("Pumba");
        elephant.getAge(5);
        move();
        elephant.sleep();

        Herbivore elephant1 = new Elephant();
        elephant1.eat();
        elephant1.getVegetables();
    }
}
