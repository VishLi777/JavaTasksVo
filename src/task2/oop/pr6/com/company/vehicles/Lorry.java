package task2.oop.pr6.com.company.vehicles;

import task2.oop.pr6.com.company.details.Engine;
import task2.oop.pr6.com.company.professions.Driver;

public class Lorry extends Car{

    private int carrying;


    public Lorry(String brandAuto, String classAuto, double weightAuto, Driver driver, Engine engine, int carrying) {
        super(brandAuto, classAuto, weightAuto, driver, engine);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }


}
