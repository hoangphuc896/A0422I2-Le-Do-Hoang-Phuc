package ss5accessmodifier.exercise.circle;

public class ClassCircle {
    private double radius = 1.0;
    private String color = "red";

    public ClassCircle() {

    }

    public ClassCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                ", color='" + color + '\''
                ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double Area = 3.14 * this.radius * this.radius;
        return Area ;
    }
}
