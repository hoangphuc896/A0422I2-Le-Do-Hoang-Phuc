package ss7abstractvsinterface.exercise.resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * this.lenght;
    }

    public double getPerimeter() {
        return 2 * (width + this.lenght);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    public void resize(double percent) {
        this.width = this.width * percent;
        this.lenght = this.lenght * percent;
    }
}
