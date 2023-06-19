package task2.oop.pr7;

import task2.oop.pr7.animals.Animal;
import task2.oop.pr7.animals.Cat;
import task2.oop.pr7.animals.Dog;
import task2.oop.pr7.animals.Horse;

public class AnMain {

    public static void main(String[] args) {
        Dog dog = new Dog("bone", "Moscow", "Can");
        Cat cat = new Cat("fish", "Moscow", "Can");
        Horse horse = new Horse("oats", "Moscow", "Can");
        Animal[] animals = {dog, cat, horse};
        Veterinarian veterinarian = new Veterinarian();

        for(Animal st : animals){
            veterinarian.treatAnimal(st);
        }
    }
}
