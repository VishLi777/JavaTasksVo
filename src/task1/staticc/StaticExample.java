package task1.staticc;

public class StaticExample {

    //not static field
    int l;

    //static fields
    static int v;

    static int o;
    static{
        o=8;
    }

    //static method only with static field
    static int kiss;

    public static void myCounter(){
        kiss++;
        System.out.println("Now my bfrnd should kiss me -> " + kiss);
    }



}
