package com.example.car.Services;

import com.example.car.Car;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarService {

//    List<Car> cars = new ArrayList<>();
    Set<Car> cars = new HashSet<>();


    public List<Car> getByMaxSpeed(int maxSpeed){
        List<Car> responseCars = new ArrayList<>();
        for(Car car: cars)
            if(car.getMaxSpeed() == maxSpeed)
                responseCars.add(car);

        return responseCars;
    }

    public List<Car> getByColor(String color){
        List<Car> responseCars = new ArrayList<>();
        for(Car car: cars)
            if(car.getColor().equals(color))
                responseCars.add(car);

        return responseCars;
    }

    public boolean fillCars() {
        try {
//            Set<Integer> s = new HashSet<>();
//            s.add(1);
//            s.add(1);

            Car car = new Car(1,100, "blue", "9tka", 100.0);
            Car car2 = new Car(1,400, "blue", "9tka", 100.0);
//            System.out.println(car);
//            System.out.println(car2);
            Car car1 = new Car(2,200, "blue", "6ka", 200.0);
            cars.add(car);
            cars.add(car1);
            cars.add(car2);
        }catch (Exception e){
            System.out.println("Something is wrong");
            return false;
        }
        return true;
    }

    public boolean addCar(String body){
        JSONObject jsonObject = new JSONObject(body);
        Integer id = jsonObject.getInt("id");
        Integer maxSpeed = jsonObject.getInt("maxSpeed");
        String color = jsonObject.getString("color");
        String model = jsonObject.getString("model");
        Double price = jsonObject.getDouble("price");
        Car car = new Car(id, maxSpeed, color, model, price);
        return cars.add(car);


    }

    public String changeByModel(String model, Double price) {
        boolean flag=false;
        try {
            for (Car car : cars) {
                if (car.getModel().equals(model)) {
                    car.setPrice(price);
                    flag = true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return "Failed";
        }
        return flag ? "Success" : "Model not found";
    }

    public Set<Car> getAll() {
        return cars;
    }
}
