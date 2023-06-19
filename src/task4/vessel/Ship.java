package task4.vessel;

public class Ship extends Vessel {

    @Override
    public void swim(double minimumAccelerationSpeed, double maximumAccelerationSpeed){
        double avgSpeed= (minimumAccelerationSpeed+ maximumAccelerationSpeed)/2;
        System.out.println("I am Ship and Swim on " + avgSpeed);
    };

    public static void printShip(){
        System.out.println("It`s cool today");
    }
}
