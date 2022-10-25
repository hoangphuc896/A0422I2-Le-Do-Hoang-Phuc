package ss7abstractvsinterface.exercise.resizeable;

public class Rectangle extends Square implements Resizeable {
    @Override
    public void resize(double percent) {
        width += width * percent;
        lenght += lenght * percent;
    }
    private double width ;
    private double lenght ;

    public Rectangle (){

    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.width*this.lenght;
    }
    public double getPerimeter(){
        return 2*(this.width*this.lenght);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} ";
    }
}
