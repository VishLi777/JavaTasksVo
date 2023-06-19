package task5.equalsforcar;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class CarTest {
    static class Carr {

        private Integer maxSpeed;
        private String model;
        private Double price;

        public Carr() {
        }

        public Carr(Integer maxSpeed, String model, Double price) {
            this.maxSpeed = maxSpeed;
            this.model = model;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Carr carr = (Carr) o;

            if (!maxSpeed.equals(carr.maxSpeed)) return false;
            if (!model.equals(carr.model)) return false;
            return price.equals(carr.price);
        }

        @Override
        public int hashCode() {
            int result = maxSpeed.hashCode();
            result = 31 * result + model.hashCode();
            result = 31 * result + price.hashCode();
            return result;
        }
    }

    static class FullCar{
        private Carr carr;
        private String color;

        public FullCar(Carr car, String color) {
            this.carr = car;
            this.color = color;
        }

        @Override
        public String toString() {
            return "FullCar{" +
                    "car=" + carr +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


    static Map<Carr, FullCar> cars = new HashMap<>();

    private static void fillCars() {
        Carr carr = new Carr(110, "mur", 1000000.0);
        FullCar full = new FullCar(carr, "pink");
        cars.put(carr, full);
    }

    private static void getFullCar() {
        Carr carr = new Carr(110, "mur", 1000000.0);
        FullCar full = cars.get(carr);
        System.out.println(full);
    }

    public static void main(String[] args) {
        fillCars();
        getFullCar();
    }
}

