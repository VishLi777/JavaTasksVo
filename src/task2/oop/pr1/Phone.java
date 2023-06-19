package task2.oop.pr1;

import java.io.Serializable;
import java.util.List;

public class Phone implements Serializable {
    private Long number;
    private String model;
    private Double weight;

    public Phone(Long number, String model, Double weight) {
        this(number, model);
//        this.number = number;
//        this.model = model;
        this.weight = weight;
    }

    public Phone(Long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println("Calls-> " + name);
    }

    public void receiveCall(String name, Long number){
        System.out.println("Calls-> " + name + "; Number-> " + number);
    }

    public void sendMessage(List<Long> nums){
        System.out.println("Nums-> " + nums);
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
