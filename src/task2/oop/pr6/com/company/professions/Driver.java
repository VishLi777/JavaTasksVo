package task2.oop.pr6.com.company.professions;

public class Driver extends Person {

    private double workExperience;

    public Driver() {
    }

    public Driver(String FIO, int age, double workExperience) {
        super(FIO, age);
        this.workExperience = workExperience;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                ", workExperience=" + workExperience +
                '}';
    }
}
