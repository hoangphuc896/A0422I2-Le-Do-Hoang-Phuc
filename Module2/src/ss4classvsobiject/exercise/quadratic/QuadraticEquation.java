package ss4classvsobiject.exercise.quadratic;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = getB() * 2 - 4 * getA() * getC();
        return delta;
    }

    public double getRoot1() {
        double r1 = (-getB() + Math.sqrt(this.getDiscriminant())) / (getA() * 2);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-getB() - Math.sqrt(this.getDiscriminant())) / (getA() * 2);
        return r2;
    }
}
