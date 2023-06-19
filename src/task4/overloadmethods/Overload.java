package task4.overloadmethods;

public class Overload {

    public double multiple(int a, int b){
//        double c=a;
//        double d=b;
//        return c*d;
        return a*b;

    }

    public double multiple(double a, double b){
        return a*b;
    }

    public double multiple(String a, String b){
        return Double.parseDouble(a) * Double.parseDouble(b);
    }


    public static void main(String[] args) {
        Overload overload = new Overload();
        System.out.println(overload.multiple(1, 2));
        System.out.println(overload.multiple(3.0,4.0));
        System.out.println(overload.multiple("1","1"));
    }
}
