package ss7abstractvsinterface.exercise.resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(4.5,5.2);
        System.out.println(square);
        square = new Square(4.5,5.2,"yelow",true);
        System.out.println(square);
    }
}
