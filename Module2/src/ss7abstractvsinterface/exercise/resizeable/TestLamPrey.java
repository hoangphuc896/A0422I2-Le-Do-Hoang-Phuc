package ss7abstractvsinterface.exercise.resizeable;

import java.util.Scanner;

public class TestLamPrey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Test :");
        int test = scanner.nextInt();
        switch (test){
            case 1:
                System.out.println("TestCircle :");
                testCircle();
                break;
            case 2:
                System.out.println("TestSquare :");
                testSquare();
                break;
            case 3:
                System.out.println("TestRectangle :");
                testRectangle();
                break;
        }
    }


    public static void testCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color :");
        String color = scanner.nextLine();
        System.out.println("Enter filler :");
        boolean filler = scanner.hasNextLine();
        Circle circle = new Circle(color, filler, radius);
        System.out.println("The Circle :" + circle.toString());
        double percent = Math.random()*99+1;
        System.out.println("The percent:" + percent + "%");
        System.out.println("The Area Circle before :" +circle.getArea());
        circle.resize(percent);
        System.out.println("the Area Circle after :"+ circle.getArea());
    }

    public static void testSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Color :");
        String color = scanner.nextLine();
        System.out.println("Enter filler :");
        boolean filler = scanner.hasNextLine();
        Square square = new Square(color, filler);
        System.out.println("The Square :" + square.toString());
        square.howToColor();
    }

    public static void testRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Color :");
        String color = scanner.nextLine();
        System.out.println("Enter filler :");
        boolean filler = scanner.nextBoolean();
        System.out.println("Enter width :");
        double width = scanner.nextDouble();
        System.out.println("Enter filler :");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(color, filler, width, length);
        System.out.println("The Rectangle :" + rectangle.toString());
        double percent = Math.random()*99+1;
        System.out.println("The percent" + percent + "%");
        System.out.println("The Area Rectangle before :" +rectangle.getArea());
        rectangle.resize(percent);
        System.out.println("the Area Rectangle after :"+ rectangle.getArea());
    }

}



