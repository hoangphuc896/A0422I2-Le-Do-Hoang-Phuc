package ss7abstractvsinterface.exercise.resizeable;

public class TestGeoMetry {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circles(2.4);
        shapes[1]= new Rectangle(2.4,5.2);
        shapes[2]= new Square(4.2,5.1);

        for (Shape shape:shapes){
            double percent = Math.random()*99+1;
            System.out.println("Percent: "+ percent + "%");
            if (shape instanceof Circles){
                System.out.println("Circle area: "+((Circles)shape).getArea());
                ((Circles)shape).resize(percent);
                System.out.println("New circle area: " + ((Circles)shape).getArea());
            }else if (shape instanceof Rectangle){
                System.out.println("Rectangle area: "+ ((Rectangle)shape).getArea());
                ((Rectangle)shape).resize(percent);
                System.out.println("New Rectangle area: "+ ((Rectangle)shape).getArea());
            }else if (shape instanceof Square){
                System.out.println("Square area: "+((Square)shape).getArea());
                ((Square)shape).resize(percent);
                System.out.println("New Square area: "+((Square)shape).getArea());
                System.out.println("Colorable:" +((Square) shape).howTocolor());
            }
        }
    }
}
