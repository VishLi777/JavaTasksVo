package com.example.complexpart2.services;


import com.example.complexpart2.Complex;
import com.example.complexpart2.entities.*;


import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ComplexService {



    List<Dom> houses = new ArrayList<>();

//    List<Human> humans = new ArrayList<>();

    public List<Dom> getAll() {
        return houses;
    }
    public boolean fillHumans() {
        try {
            List<Human> humans1 = new ArrayList<>();
            Map<String, List<Human>> apartments1 = new HashMap<>();
            Human l1 = new Human("L1", "O1", "zh", 20);
            humans1.add(l1);
            apartments1.put("1", humans1);
//            humans.add(l1);

            List<Human> humans2 = new ArrayList<>();
            Human l2 = new Human( "L2", "O2", "m", 21);
            humans2.add(l2);
            apartments1.put("2", humans2);
//            humans.add(l2);
//            List<Human> hum = apartments.get("1");

            List<Human> humans3 = new ArrayList<>();
            Human l3 = new Human( "L3", "O3", "m", 48);
            humans3.add(l3);
            apartments1.put("3", humans3);
//            humans.add(l3);

            List<Human> humans4 = new ArrayList<>();
            Map<String, List<Human>> apartments2 = new HashMap<>();
            Human l4 = new Human("L1", "O4", "hz", 100500);
            humans4.add(l4);
            apartments2.put("4", humans4);

            Dom dom = new Dom(apartments1, "olololo");
            houses.add(dom);

            dom = new Dom(apartments2, "ololo");
            houses.add(dom);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public List<Dom> getByAddress(String address){
        List<Dom> responseHouses = new ArrayList<>();
        for(Dom dom: houses)
            if(dom.getAddress().equals(address))
                responseHouses.add(dom);

        return responseHouses;
    }

    public List<Human> getByName(String name){
        List<Human> responseHumans = new ArrayList<>();

        for(Dom dom: houses){
            Map<String, List<Human>> aparts= dom.getApartments();
            Set<Map.Entry<String, List<Human>>> values = aparts.entrySet();

            for(Map.Entry<String, List<Human>> el : values){
                for(Human human: el.getValue()){
                    if(human.getName().equals(name)){
                        responseHumans.add(human);
                    }
                }
            }

        }
        return responseHumans;
    }


//    public List<Human> getByNameAddress(String name, String address){
//        List<Human> responseHumans = new ArrayList<>();
//
//        for(Dom dom: houses){
//            if(!dom.getAddress().equals(address))
//                continue;
//
//            Map<String, List<Human>> aparts= dom.getApartments();
//            Set<Map.Entry<String, List<Human>>> values = aparts.entrySet();
//
//            for(Map.Entry<String, List<Human>> el : values){
//                for(Human human: el.getValue()){
//                    if(human.getName().equals(name)){
//                        responseHumans.add(human);
//                    }
//                }
//            }
//        }
//        return responseHumans;
//    }

    public List<Human> getByNameAddress(String name, String address){
        List<Human> responseHumans = new ArrayList<>();

        for(Dom dom: getByAddress(address)){
            Map<String, List<Human>> aparts = dom.getApartments();
            Set<Map.Entry<String, List<Human>>> values = aparts.entrySet();

            for(Map.Entry<String, List<Human>> el : values){
                for(Human human: el.getValue()){
                    if(human.getName().equals(name)){
                        responseHumans.add(human);
                    }
                }
            }
        }
        return responseHumans;
    }

//    public List<Human> getByApartmentsAddress(String num, String address){
//        List<Human> responseHumans = new ArrayList<>();
//
//        for(Dom dom: getByAddress(address)){
//            Map<String, List<Human>> apartments= dom.getApartments();
//            Set<Map.Entry<String, List<Human>>> values = apartments.entrySet();
//
//            for(Map.Entry<String, List<Human>> el : values){
//                    if(el.getKey().equals(num)){
//                        responseHumans.addAll(el.getValue());
//                    }
//                }
//            }
//        return responseHumans;
//    }

    public List<Human> getByApartmentsAddress(String num, String address){
        List<Human> responseHumans = new ArrayList<>();

        for(Dom dom: getByAddress(address)){
            Map<String, List<Human>> apartments= dom.getApartments();
            responseHumans.addAll(apartments.get(num));
        }
        return responseHumans;
    }



//    public List<Dom> getByHouseApartment(String address, String id){
//        List<Dom> responseHumans = new ArrayList<>();
//        for(Dom dom : houses)
//            if(dom.getAddress().equals(address) & dom.getApartments().equals(id))
//                responseHumans.add(dom);
//
//        return responseHumans;
//    }



}
