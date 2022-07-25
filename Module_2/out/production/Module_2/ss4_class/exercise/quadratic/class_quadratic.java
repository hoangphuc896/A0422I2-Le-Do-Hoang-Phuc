package ss4_class.exercise.quadratic;

public class class_quadratic {
    private double a, b, c;

    public class_quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = getB() * 2 - 4 * getA() * getC();
        return delta;
    }

    public double getRoot1() {
        double root1 = (-getB() + Math.sqrt(this.getDiscriminant())) / (getA() * 2);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-getB() - Math.sqrt(this.getDiscriminant())) / (getA() * 2);
        return root2;
    }

}
