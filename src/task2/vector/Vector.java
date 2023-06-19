package task2.vector;
import java.util.*;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength(double x, double y, double z){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        
    }

//    public double calculateScalyar(double x1, double x2, double y1, double y2, double z1,double z2){
////        //можно засунуть векторы в массив и брать поэлементно если больше двух и складывать
////        for(int i=0; i<d[0];i++){
////            sum[0]=a[i]*b[i];
////        }
//        return x1*x2+y1*y2+z1*z2;
//    }

    public double calculateScalyr(double x1, double y1, double z1){
        return x*x1+y*y1+z*z1;
    }

    public String calculateVector(double x2, double y2, double z2) {
        double a=y*z2-z*y2;
        double b=z*x2-x*z2;
        double c=x*y2-y*x2;
        return( a + ", " + b + ", " + c);
    }

    public String calculateSum(double x2, double y2, double z2){
        double a=x+x2;
        double b=y+y2;
        double c=z+z2;
        return( a + ", " + b + ", " + c);
    }

    public String calculateDifference(double x2, double y2, double z2){
        double a=x-x2;
        double b=y-y2;
        double c=z-z2;
        return( a + ", " + b + ", " + c);
    }

    public static Vector[] randomVector(int N){
        Vector[] vectors = new Vector[N];
//        Vector vect1;
        for(int i=0; i<N; i++){
            Vector vect1 = new Vector(Math.random(), Math.random(), Math.random());
            vectors[i] = vect1;
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Vector vector = new Vector(1,2,3);
//        vector.calculateLength(1,2, 3);
//        System.out.println(vector.calculateLength(1,2, 3));
        System.out.println(Arrays.toString(randomVector(2)));


    }


}
