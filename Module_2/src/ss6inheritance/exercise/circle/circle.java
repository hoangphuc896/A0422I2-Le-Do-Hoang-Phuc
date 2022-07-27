package ss6inheritance.exercise.circle;

public class circle {
    private double radius;
    private String color ;
    public circle(){

    }
    public circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
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
    public double getArea(){
        double result = Math.PI*Math.pow(getRadius(),2);
        return result;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
