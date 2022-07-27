package ss5accessmodifier.exercise.accessmodifier;

public class class_access {
    private static double radius = 1.0;
    private String color = "red";
    public class_access(){

    }
    public class_access(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public static double getArea(){
        double result = Math.PI*Math.pow(class_access.radius,2);
        return result ;
    }
}
