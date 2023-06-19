package task2.oop.pr6.com.company.vehicles;

import task2.oop.pr6.com.company.professions.Driver;
import task2.oop.pr6.com.company.details.Engine;

public class Car {
    protected String brandAuto;
    protected String classAuto;
    protected double weightAuto;
    protected Driver driver;
    protected Engine engine;


    public void start(){
        System.out.println("GO");
    }

    public void stop(){
        System.out.println("STOP");
    }
    public void turnRight(){
        System.out.println("TURN RIGHT");
    }

    public void turnLeft(){
        System.out.println("TURN LEFT");
    }

    public Car() {
    }

    public Car(String brandAuto, String classAuto, double weightAuto, Driver driver, Engine engine) {
        this.brandAuto = brandAuto;
        this.classAuto = classAuto;
        this.weightAuto = weightAuto;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrandAuto() {
        return brandAuto;
    }

    public void setBrandAuto(String brandAuto) {
        this.brandAuto = brandAuto;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public double getWeightAuto() {
        return weightAuto;
    }

    public void setWeightAuto(double weightAuto) {
        this.weightAuto = weightAuto;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAuto='" + brandAuto + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weightAuto=" + weightAuto +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
