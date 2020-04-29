package animalpack;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    static List<Animal> animals;

    public void run() {
        System.out.println("Животное бежит");
    }

    public static void main(String[] args) {
       Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();

        animals = new ArrayList<>();

        animals.add(animal);
        animals.add(dog);
        animals.add(cat);
        animals.add(lion);
        for (Animal x : animals) {
            x.run();
        }

    }
}
