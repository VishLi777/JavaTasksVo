package com.example.car;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Car {

    private Integer id;

    private Integer maxSpeed;
    private String color;
    private String model;
    private Double price;

    public Car() {
    }

    public Car(Integer id, Integer maxSpeed, String color, String model, Double price) {
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.model = model;
        this.price = price;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return id != null ? id.equals(car.id) : car.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static Double sumPriceAutopark(List<Car> s){
        Double c=0.0;
        for (Car car : s){
            c+=car.getPrice();
        }
        return c;

    }

    public static String getTheMostPopularColor(List<Car> s){

        String color = null;



        return color;

    }

    public static Integer getAmountCarsMaxSpeed(List<Car> s, int N){
        int c=0;
        for (Car car: s){
            if (car.getMaxSpeed() > N){
                c+=1;
            }
        }
        return c;
    }

//    public static void main(String[] args) {
//        List<Car> s = new ArrayList<>(2);
//
//        Car car = new Car(100, "blue", "9tka", 100.0);
//        Car car1 = new Car(200, "blue", "6ka", 200.0);
//        s.add(car);
//        s.add(car1);
//
//        System.out.println(sumPriceAutopark(s));
//        System.out.println(getAmountCarsMaxSpeed(s, 300));
//
//        System.out.println(getTheMostPopularColor(s));
//
//
//    }

}

