package task3.maxminarg;


import java.util.Arrays;

public class Array {

//    private double x;
//
//    public Array(double x) {
//        this.x = x;
//    }

    public static Double[] randomArray(int N){
        Double[] arrays = new Double[N];
        for(int i=0; i<N; i++){
            arrays[i] = Math.random();
        }
        return arrays;
    }

    public static double minValue(Double[] arrays){
        double c = arrays[0];
        for(int i=0; i<arrays.length; i++){
            if(arrays[i] < c){
              c = arrays[i];
            }
        }
        return c;
    }

    public static double maxValue(Double[] arrays){
        double c = arrays[0];
        for (Double array : arrays) {
            if (array > c) {
                c = array;
            }
        }
        return c;
    }

    public static double avgValue(Double[] arrays){
        double c = 0;
//        int counter=0;
        for(int i=0; i<arrays.length; i++){
            c+=arrays[i];
//            counter += 1;

        }
        return c/arrays.length;
    }

//    @Override
//    public String toString() {
//        return "" +
//                  x +
//                "";
//    }

    public static void main(String[] args) {

        Double[] a = randomArray(2);
        System.out.println(Arrays.toString(a));
        System.out.println(minValue(a));
        System.out.println(maxValue(a));
        System.out.println(avgValue(a));

    }
}
