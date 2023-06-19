package task4.ball;

import java.util.ArrayList;
import java.util.List;

public class Ball {

    private String color;
    private double size;
    private double weight;
    private String typeOfCover;

    public Ball() {
    }

    public Ball(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void changeSizeMinus() {
        this.size = this.size-1;
    }

    public void changeSizePlus() {
        this.size = this.size+1;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public static List<Ball> randomBallArray(int N){
        List<Ball> balls = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            Ball ball = new Ball("yellow");
            ball.setSize(Math.random());
            ball.setWeight(Math.random());
            ball.setTypeOfCover("1");

            balls.add(ball);
        }
        return balls;
    }

    public static int ballAmount(List<Ball> balls, double c) {
        int counter = 0;
        for (Ball ball : balls) {
            if (ball.getSize() > c) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void ballPlus(List<Ball> balls){
        for (Ball ball : balls) {
            double a = ball.getSize() + 1;
            ball.setSize(a);
        }
    }

    public static List<Ball> ballMinus(List<Ball> balls){
//        for (int i = 0; i < balls.length; i++) {
//            double a = balls[i].getSize() - 1;
//            balls[i].setSize(a);
//        }
        for (Ball ball : balls) {
            double a = ball.getSize() - 1;
            ball.setSize(a);
        }
        return balls;
    }


    @Override
    public String toString() {
        return "\nBall {" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", typeOfCover='" + typeOfCover + '\'' +
                "}";
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        List<Ball> c = Ball.randomBallArray(2);

        System.out.println(c);


    }

}

