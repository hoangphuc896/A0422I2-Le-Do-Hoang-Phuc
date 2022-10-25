package ss7abstractvsinterface.exercise.resizeable;

public class Circle extends Square implements Resizeable{
    @Override
    public void resize(double percent) {
        radius += radius*percent;
    }
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.14 ;
    }
    public double getPerimeter(){
        return 2*this.radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} ";
    }
}
