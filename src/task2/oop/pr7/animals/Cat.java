package task2.oop.pr7.animals;

public class Cat extends Animal{
    private String mur;

    @Override
    public void makeNoise() {
        System.out.println("Cat is sleeping");
    }

    public Cat() {
    }

    public Cat(String food, String location, String mur) {
        super(food, location);
        this.mur = mur;
    }

    public String getMur() {
        return mur;
    }

    public void setMur(String mur) {
        this.mur = mur;
    }
}
