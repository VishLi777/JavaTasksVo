package task2.oop.pr9;

public class ShapeMain {

    public static void main(String[] args) {

        Circle circle = new Circle(1,1,3, "red");
        Rectangle rectangle = new Rectangle(5, 5, 3,3, "green");
        Shape[] shapes = {circle, rectangle};
        for(Shape sh : shapes){
            sh.draw();
        }
    }
}
