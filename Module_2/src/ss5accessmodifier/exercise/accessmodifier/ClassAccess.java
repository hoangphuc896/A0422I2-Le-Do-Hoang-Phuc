package ss5accessmodifier.exercise.accessmodifier;

public class ClassAccess {
    private static double radius = 1.0;
    private String color = "red";
    public ClassAccess(){

    }
    public ClassAccess(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public static double getArea(){
        double result = Math.PI*Math.pow(ClassAccess.radius,2);
        return result ;
    }
}
