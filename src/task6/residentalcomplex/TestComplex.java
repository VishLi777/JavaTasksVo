package task6.residentalcomplex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestComplex {




    static class IdApartment {
        private String numberApartment;

        public IdApartment(String numberApartment) {
            this.numberApartment = numberApartment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IdApartment that = (IdApartment) o;

            return numberApartment != null ? numberApartment.equals(that.numberApartment) : that.numberApartment == null;
        }

        @Override
        public int hashCode() {
            return numberApartment != null ? numberApartment.hashCode() : 0;
        }


        static class Human {
            private IdApartment id;

            private String name;

            private String lastName;
            private String gender;
            private Integer age;

            public Human(IdApartment id, String name, String lastName, String gender, Integer age) {
                this.id = id;
                this.name = name;
                this.lastName = lastName;
                this.gender = gender;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Human{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", gender='" + gender + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        static List<Human> humans = new ArrayList<>();

        static Map<IdApartment, List<Human>> apartments = new HashMap<>();

        static class Dom{
            private Map<IdApartment, List<Human>> apartments;
            private String address;

            public Dom(Map<IdApartment, List<Human>> apartments, String address) {
                this.apartments = apartments;
                this.address = address;
            }

            @Override
            public String toString() {
                return "Dom{" +
                        "apartments=" + apartments +
                        ", address='" + address + '\'' +
                        '}';
            }
        }




        private static void fillHumans() {
            IdApartment id = new IdApartment("1");
            Human lida = new Human(id, "Li", "Osl", "zh", 20);
            humans.add(lida);
            Human vova = new Human(id, "Vo", "Pol", "m", 20);
            humans.add(vova);
            apartments.put(id, humans);

        }

        private static void getHuman() {
            IdApartment id = new IdApartment("1");
            List<Human> hum = apartments.get(id);
            System.out.println(hum);
        }

        public static void main(String[] args) {
            fillHumans();
            getHuman();
            Dom dom = new Dom(apartments, "olololo");
            System.out.println(dom);


        }
    }
}

