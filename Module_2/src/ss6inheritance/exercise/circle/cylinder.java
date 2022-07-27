package ss6inheritance.exercise.circle;

public class cylinder extends circle {

    public cylinder() {
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double total = Math.PI*Math.pow(this.getArea(),2)*height;
        return total;
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "height=" + height +
                '}';
    }
}
