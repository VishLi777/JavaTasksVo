package task3.vessel;

public class Main {

    public static void main(String[] args) {
        Vessel vessel = new Ship();
        vessel.swim(1, 3);
        Ship.printShip();

        System.out.println("------------");

        Vessel vessel1 = new Submarine();
        vessel1.swim(2, 6);
        Submarine.printSubmarine();

        System.out.println("------------");

        Vessel vessel2 = new FlyingDutchman();
        vessel2.swim(3, 7);
        FlyingDutchman.printFlyingDutchman();
    }

}
