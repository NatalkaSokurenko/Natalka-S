package task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.square());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(3);
        rectangle2.setWidth(4);
        System.out.println(rectangle2.square());

        Circle circle = new Circle(2);
        System.out.println(circle.square());

        Triangle triangle = new Triangle();
        System.out.println(triangle.square());

    }
}
