package task2.oop;

import task2.oop.pr1.Phone;
import task2.oop.pr2.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("                 ");
        System.out.println("-----Phone------");
        Phone phone1 = new Phone(1L, "Li", 54.4);
        Phone phone2 = new Phone(2L, "Vo", 73.7);
        Phone phone3 = new Phone(3L, "SchastLiVo", 128.1);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("LV", 12L);
        List<Long> nums = new ArrayList<>(List.of(1L, 2L, 4L));
        phone1.sendMessage(nums);
//        phone1.sendMessage(List.of(1L, 2L, 4L));
//        List<Long> n = List.of(1L, 2L, 4L);// non resizable
//        n.add(5L);
//        System.out.println(n);


        System.out.println("                 ");
        System.out.println("-----Person------");

        Person person1 = new Person();
        System.out.println(person1);
        Person person2 = new Person("Li", 20L);
        System.out.println(person2);

        System.out.println("                 ");
        System.out.println("-----Reader------");







    }
}
