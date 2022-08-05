package ss7abstractvsinterface.exercise.resizeable;

public class Circles extends Shape {

    private double radius;

    public Circles() {

    }

    public Circles(double radius) {
        this.radius = radius;
    }


    public Circles(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double result = Math.PI * Math.pow(this.radius, 2);
        return result;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circles{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }
}
