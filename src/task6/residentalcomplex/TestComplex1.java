package task6.residentalcomplex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestComplex1 {





        static class Human {
            private String id;

            private String name;

            private String lastName;
            private String gender;
            private Integer age;

            public Human(String id, String name, String lastName, String gender, Integer age) {
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

        static Map<String, List<Human>> apartments = new HashMap<>();

        static class Dom{
            private Map<String, List<Human>> apartments;
            private String address;

            public Dom(Map<String, List<Human>> apartments, String address) {
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

            Human lida = new Human("1", "Li", "Osl", "zh", 20);
            humans.add(lida);
            Human vova = new Human("1", "Vo", "Pol", "m", 20);
            humans.add(vova);
            apartments.put("1", humans);

        }

        private static void getHuman() {
            List<Human> hum = apartments.get("1");
            System.out.println(hum);
        }

        public static void main(String[] args) {
            fillHumans();
            getHuman();
            Dom dom = new Dom(apartments, "olololo");
            System.out.println(dom);


        }
    }


