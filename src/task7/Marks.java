package task7;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Marks {

    // Есть 5 оценок. 1, 2, 3, 4 и 5.
    // Пользователь вводит с экрана цифры, характеризующие оценку студента
    // Задача 1) какую оценку получает большее кол-во студентов
    // Задача 2) вывести сумму всех студентов
    // Максимум 2 переменные


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        Map<String,Integer> map = new HashMap<>();
        while(true){
            String num = in.nextLine();
            if ("0".equals(num))
                break;
            System.out.printf("Your number: %s \n", num);
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);
        }

        in.close();

        int c=0;
        for(Map.Entry<String, Integer> row: map.entrySet()){
            System.out.printf("Key %s and value %d \n", row.getKey(),row.getValue());
            c+=row.getValue();
//            System.out.println(c);
        }
        System.out.println("Students amount is: "+ c);



    }
}