package task4.vessel;

public class FlyingDutchman extends Vessel {
    @Override
    public void swim(double minimumAccelerationSpeed, double maximumAccelerationSpeed){
        double avgSpeed= (minimumAccelerationSpeed+maximumAccelerationSpeed)/2;
        System.out.println("I am FlyingDutchman and Swim on " + avgSpeed);
    };

    public static void printFlyingDutchman(){
        System.out.println("I'm a ghost");
    }
}
