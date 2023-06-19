package task4.vessel;

public class Submarine extends Vessel {

    @Override
    public void swim(double minimumAccelerationSpeed, double maximumAccelerationSpeed){
        double avgSpeed= (minimumAccelerationSpeed+ maximumAccelerationSpeed)/2;
        System.out.println("I am Submarine and Swim on " + avgSpeed);
    };

    public static void printSubmarine(){
        System.out.println("A submarine (or sub) is a watercraft capable of independent operation underwater.");
    }
}
