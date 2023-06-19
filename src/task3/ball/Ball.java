package task3.ball;

import java.util.Arrays;

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

    public static Ball[] randomBallArray(int N){
        Ball[] balls = new Ball[N];
        for(int i=0; i<N; i++){
            Ball ball = new Ball("yellow");
            balls[i] = ball;
            ball.setSize(Math.random());
            ball.setWeight(Math.random());
            ball.setTypeOfCover("1");
        }
        return balls;
    }

    public static int ballAmount(Ball[] balls, double c) {
        int counter = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].getSize() > c) {
                counter += 1;
            }
        }
        return counter;
    }

    //Ball[] to void
//    public static Ball[] ballPlus(Ball[] balls){
//        for (int i = 0; i < balls.length; i++) {
//            double a = balls[i].getSize() + 1;
//            balls[i].setSize(a);
//        }
//        return balls;
//    }

    public static void ballPlus(Ball[] balls){
        for (int i = 0; i < balls.length; i++) {
            double a = balls[i].getSize() + 1;
            balls[i].setSize(a);
        }
    }

    public static Ball[] ballMinus(Ball[] balls){
        for (int i = 0; i < balls.length; i++) {
            double a = balls[i].getSize() - 1;
            balls[i].setSize(a);
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
//        Ball ball = new Ball();
        Ball[] c = Ball.randomBallArray(2);


        System.out.println(Arrays.toString(c));

        System.out.println(Ball.ballAmount(c, 0.5));

//        System.out.println(Arrays.toString(Ball.ballPlus(c)));
        Ball.ballPlus(c);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(Ball.ballMinus(c)));

    }

}

