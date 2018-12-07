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

        System.out.println(fibonacci(5));
        System.out.println(fibonacci(3));
    }

    static int fibonacci(int count){
        if (count==1){
            return 0;
        }
        if (count == 2){
            return 1;
        }
        int result = 1;
        int lastresult = 1;
        for (int i = 1; i<count; i++){
            int j = result;   //result 5, j 5
            result = result + lastresult; //result = 5 + 3 = 8
            lastresult = j; //lastresult = 5
        }
        return result;

    }
}
