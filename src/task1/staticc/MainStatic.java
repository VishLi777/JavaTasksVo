package task1.staticc;

public class MainStatic {
    public static void main(String[] args) {
        StaticExample ex1 = new StaticExample();
        ex1.l = 4;

        StaticExample ex2 = new StaticExample();
        ex2.l = 3;

        StaticExample ex3 = new StaticExample();
        ex3.v = 2;

        StaticExample ex4 = new StaticExample();
        System.out.println("STAT" + ex4.v);
        ex4.v = 1;

        StaticExample ex5 = new StaticExample();

        NotStaticClassBottle.Water bottle = new NotStaticClassBottle.Water();
        bottle.ml = 500;

        System.out.println("NotStatic -> " + ex1.l);
        System.out.println("NotStatic -> " + ex2.l);

        System.out.println("Static -> " + ex3.v);
        System.out.println("Static -> " + ex4.v);

        System.out.println("Static -> " + ex4.o);

        StaticExample.myCounter();
        StaticExample.myCounter();
        StaticExample.myCounter();
        StaticExample.myCounter();
        StaticExample.myCounter();

        System.out.println("Bottle consists of - > " + bottle.ml + " ml");
    }
}
