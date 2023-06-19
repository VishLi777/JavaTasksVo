package task2.oop.pr7.animals;

public class Dog extends Animal{
    private String guf;

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking");
    }

    public Dog() {
    }

    public Dog(String food, String location, String guf) {
        super(food, location);
        this.guf = guf;
    }

    public String getGuf() {
        return guf;
    }

    public void setGuf(String guf) {
        this.guf = guf;
    }
}
