package task4.vessel;

public abstract class Vessel {
    protected String vesselMaterial;
    protected double size;
    protected String color;
    protected double maximumAccelerationSpeed;
    protected double minimumAccelerationSpeed;

    public abstract void swim(double minimumAccelerationSpeed, double maximumAccelerationSpeed);
}
