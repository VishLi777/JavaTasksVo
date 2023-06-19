package com.example.complexpart2.controllers;



import com.example.complexpart2.entities.*;

import com.example.complexpart2.services.ComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/complex")
public class ComplexController {

    @Autowired
    ComplexService complexService;


//    // http://localhost:7777/car/getByMaxSpeed/100
//    @GetMapping("/getByMaxSpeed/{maxSpeed}")
//    public List<Car> getByMaxSpeed(
//            @PathVariable int maxSpeed){
//        return complexService.getByMaxSpeed(maxSpeed);
//    }
//

    @PostMapping("/fillHumans")
    public String fillHumans(){
        return complexService.fillHumans() ? "Success" : "Something gone wrong";
    }

    @GetMapping("/getAll")
    public List<Dom> getAll(){
        return complexService.getAll();
    }

    // http://localhost:7777/complex/getByAddress?address=olololo
    @GetMapping("/getByAddress")
    public List<Dom> getByAddress(
            @RequestParam(required = false, defaultValue = "non") String address){
        return complexService.getByAddress(address);
    }

    // http://localhost:7777/complex/getByName?name=L1
    @GetMapping("/getByName")
    public List<Human> getByName(
            @RequestParam(required = false, defaultValue = "non") String name){
        return complexService.getByName(name);
    }

//    http://localhost:7777/complex/getByNameAddress
    @GetMapping("/getByNameAddress")
    public List<Human> getByNameAddress(
            @RequestParam() String name,
            @RequestParam() String address){
        return complexService.getByNameAddress(name, address);
    }

    @GetMapping("/getByApartmentsAddress")
    public List<Human> getByApartmentsAddress(
            @RequestParam() String num,
            @RequestParam() String address){
        return complexService.getByApartmentsAddress(num, address);
    }

//    // http://localhost:7777/complex/getBy
//    @GetMapping("/getByHouseApartment")
//    public List<Human> getByHouseApartment(
//            @RequestParam(required = false, defaultValue = "non") String address){
//            @RequestParam(required = false, defaultValue = "non") String id){
//        return complexService.getByHouseApartment(address,id);
//    }
}
