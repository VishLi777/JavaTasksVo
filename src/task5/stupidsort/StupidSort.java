package task5.stupidsort;

import task5.autopark.Car;

import java.util.*;

public class StupidSort {

//    public static void main(String[] args) {
//
//        List<Integer> s = new ArrayList<>(10);
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0; i<10; i++) {
//            s.add(scanner.nextInt());
//        }
//
//        System.out.println(s);
//
//
//    }

    private static boolean isSorted(List<Integer> s)  {
        for (int i = 1; i < s.size(); i++){
            if (s.get(i) < s.get(i-1)) {
                return false;
            }
        }
        return true;
    }
    private static final Random generator = new Random();


    public static void stupidSort(List<Integer> s)  {
        while (!isSorted(s)) {
            for (int i = 0; i < s.size(); i++){
                int randPos = generator.nextInt(s.size());
                int t = s.get(i);
                s.set(i, s.get(randPos));
                s.set(randPos, t);
            }
        }
    }

    public static List<Integer> newList() {
        List<Integer> s = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
//            int l=0;
//            s.add(scanner.nextInt());
            if(s.isEmpty()) {
                s.add(scanner.nextInt());
            }
            else{
                int l=scanner.nextInt();
                for(int j = 0; j < s.size(); j++){
                    if (l <= s.get(j)) {
                        s.add(j, l);
                        break;
                    }
                    else if(j == s.size()-1){
                        s.add(l);
                        break;
                    }
                }
            }
        }
        return s;
    }




    public static void main(String[] args) {
//        List<Integer> s = new ArrayList<>(10);
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0; i<10; i++) {
//            s.add(scanner.nextInt());
//        }
//        System.out.println(s);

        System.out.println(newList());
        //stupidSort(s);
    }
}
