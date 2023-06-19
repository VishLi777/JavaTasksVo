package com.example.car.Controllers;


import com.example.car.Car;
import com.example.car.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    // http://localhost:7777/car/getByMaxSpeed/100
    @GetMapping("/getByMaxSpeed/{maxSpeed}")
    public List<Car> getByMaxSpeed(
            @PathVariable int maxSpeed){
        return carService.getByMaxSpeed(maxSpeed);
    }

    // http://localhost:7777/car/getByColor?color=blue
    @GetMapping("/getByColor")
    public List<Car> getByColor(
            @RequestParam(required = false, defaultValue = "non") String color){
        return carService.getByColor(color);
    }

    @PostMapping("/fillCars")
    public String fillCars(){
        return carService.fillCars() ? "Success" : "Car with this id already exists";
    }

    @PostMapping("/addCar")
    public String addCar(
            @RequestBody String body,
            HttpServletResponse httpServletResponse
                         ){

        if(carService.addCar(body)){
            return "Success";
        }else{
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Car with this id already exists";

        }

//        return carService.addCar(body)  ? "Success" : "Car with this id already exists";
    }


    @PutMapping("/{model}")
    public String changeByModel(
            @PathVariable String model,
            @RequestParam() Double price){
        return carService.changeByModel(model, price);

    }

    @GetMapping("/getAll")
    public Set<Car> getAll(){
        return carService.getAll();
    }


// http//localhost:8080/car/getAll

}
