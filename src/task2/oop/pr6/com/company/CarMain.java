package task2.oop.pr6.com.company;

import task2.oop.pr6.com.company.details.Engine;
import task2.oop.pr6.com.company.professions.Driver;
import task2.oop.pr6.com.company.vehicles.Car;
import task2.oop.pr6.com.company.vehicles.Lorry;
import task2.oop.pr6.com.company.vehicles.SportCar;

public class CarMain {
    public static void main(String[] args) {

        Driver bmwDriver = new Driver("Driver1", 55, 33);
        Engine bmwEngine = new Engine(66, "BMW");
        Car car = new Car("BMW", "C", 6666, bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("Driver2", 44, 22);
        Engine lorryEngine = new Engine(33, "LorryEngine");
        Lorry lorry = new Lorry("Pickup", "D", 7777, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("Driver3", 22, 11);
        Engine sportEngine = new Engine(99, "SportEngine");
        SportCar sportCar = new SportCar("Bugatti", "C", 5555, sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
