package task2.oop.pr9;

import java.util.Objects;

public class Rectangle extends Shape{
    private int x;
    private int y;
    private int width;
    private int length;

    @Override
    public void draw() {
        System.out.printf("The main point -> coord x -> %s coord y -> %s width-> %s length -> %s", x, y, width, length);
    }

    public Rectangle(int x, int y, int width, int length, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y && width == rectangle.width && length == rectangle.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
