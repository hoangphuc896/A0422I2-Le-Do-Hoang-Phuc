package ss7abstractvsinterface.exercise.resizeable;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle  =new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(4.5,2.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.4,5.2,"red",false);
        System.out.println(rectangle);
    }
}
