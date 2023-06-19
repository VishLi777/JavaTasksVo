package task6.obmensort;

import java.util.ArrayList;
import java.util.List;

public class ExchangeSort {

    public static List<Integer> sortList(List<Integer> list) {
        //
        for (int i = 0; i < list.size() - 1; i++) {
            //perebor elementov
            for (int j = list.size() - 1; j > i; j--) {
                //obmen elementov
                if (list.get(j - 1) > list.get(j)) {
                    int exchanger = list.get(j - 1);
                    list.set(j-1, list.get(j));
                    list.set(j, exchanger);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(2);
        System.out.println(sortList(l));
        l.add(1);
        l.add(134);
        System.out.println(sortList(l));

    }
}
