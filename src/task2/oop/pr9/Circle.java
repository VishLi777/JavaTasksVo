package task2.oop.pr9;

import java.util.Objects;

public class Circle extends Shape{
    private int x;
    private int y;
    private int R;

    @Override
    public void draw() {
        System.out.printf("The center point -> coord x -> %s coord y -> %s radius -> %s%n", x, y, R);

    }

    public Circle(int x, int y, int r, String color) {
        super(color);
        this.x = x;
        this.y = y;
        R = r;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && R == circle.R;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, R);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                ", color='" + color + '\'' +
                '}';
    }
}
