package ss7abstractvsinterface.exercise.resizeable;

import ss7abstractvsinterface.exercise.colorable.Colorable;

public class Square extends Shape implements Colorable {
    private double width = 1.0;
    private double length = 1.0;
    public Square (){

    }
    public Square(double width ,double length){
        this.width=width;
        this.length=length;
    }
    public Square(double width , double length , String color , boolean filled){
        super(color , filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public String howTocolor() {

        return " Color all four sides..";
    }
}



