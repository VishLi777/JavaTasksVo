package task4.maxminarg;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static List<Double> randomArray(int N){
        List<Double> arrays = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            arrays.add(Math.random());
        }
        return arrays;
    }

    public static double minValue(List<Double> arrays){
        double c = arrays.get(0);
        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i) < c){
              c = arrays.get(i);
            }
        }
        return c;
    }

    public static double maxValue(List<Double> arrays){
        double c = arrays.get(0);
        for (Double array : arrays) {
            if (array > c) {
                c = array;
            }
        }
        return c;
    }

    public static double avgValue(List<Double> arrays){
        double c = 0;
//        int counter=0;
        for (Double el : arrays){
//        for(int i=0; i<arrays.size(); i++){
            c+=el;
        }
        return c/arrays.size();
    }

//    @Override
//    public String toString() {
//        return "" +
//                  x +
//                "";
//    }

    public static void main(String[] args) {

        List<Double> a = randomArray(2);
        System.out.println(a);
        System.out.println(minValue(a));
        System.out.println(maxValue(a));
        System.out.println(avgValue(a));

    }
}
