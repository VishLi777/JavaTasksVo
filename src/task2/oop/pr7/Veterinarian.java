package task2.oop.pr7;
import task2.oop.pr7.animals.Animal;

public class Veterinarian{

    public void treatAnimal(Animal animal){
        System.out.println("Food -> " + animal.getFood() + " Location -> " + animal.getLocation());
    }



}
