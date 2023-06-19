package task2.oop.pr6.com.company.vehicles;

import task2.oop.pr6.com.company.professions.Driver;
import task2.oop.pr6.com.company.details.Engine;

public class SportCar extends Car{

    private double speed;

    public SportCar() {
    }

    public SportCar(String brandAuto, String classAuto, double weightAuto, Driver driver, Engine engine, double speed) {
        super(brandAuto, classAuto, weightAuto, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
