package task2.oop.pr7.animals;

public class Horse extends Animal{
    private String igogo;

    @Override
    public void makeNoise() {
        System.out.println("The horse is yoking");
    }

    public Horse() {
    }

    public Horse(String food, String location, String igogo) {
        super(food, location);
        this.igogo = igogo;
    }

    public String getIgogo() {
        return igogo;
    }

    public void setIgogo(String igogo) {
        this.igogo = igogo;
    }
}
