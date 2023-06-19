package task5.autopark;

import java.util.*;

public class Car {

    private Integer maxSpeed;
    private String color;
    private String model;
    private Double price;

    public Car() {
    }

    public Car(Integer maxSpeed, String color, String model, Double price) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.model = model;
        this.price = price;
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



    public static Double sumPriceAutopark(List<Car> s){
        Double c=0.0;
        for (Car car : s){
            c+=car.getPrice();
        }
        return c;

    }

    public static Set<String> getTheMostPopularColor(List<Car> s){

        Map<String, Integer> colors = new HashMap<>();

        for (Car car: s){
//            if (colors.containsKey(car.getColor())){
//                colors.put(car.getColor(), colors.get(car.getColor()) + 1);
//            }
//            else {
//                colors.put(car.getColor(), 1);
//            }

            colors.put(car.getColor(),
                    colors.containsKey(car.getColor()) ?
                            colors.get(car.getColor()) + 1 :
                            1);
        }

        Set<Map.Entry<String, Integer>> setColors = colors.entrySet();
        int value=0;
        Set<String> maxColors = new HashSet<>();

        for (Map.Entry<String, Integer> el: setColors) {
            if (value < el.getValue()) {
                value = el.getValue();
                maxColors.add(el.getKey());
            }
            if(value == el.getValue()){
                maxColors.add(el.getKey());

            }
        }
        return maxColors;
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

    public static void main(String[] args) {
        List<Car> s = new ArrayList<>(2);

        Car car = new Car(100, "blue", "9tka", 100.0);
        Car car1 = new Car(200, "green", "6ka", 200.0);
        s.add(car);
        s.add(car1);

        System.out.println(sumPriceAutopark(s));
        System.out.println(getAmountCarsMaxSpeed(s, 300));

        System.out.println(getTheMostPopularColor(s));


    }

}

