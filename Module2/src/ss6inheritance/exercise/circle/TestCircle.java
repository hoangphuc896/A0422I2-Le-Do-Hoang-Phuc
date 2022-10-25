package ss6inheritance.exercise.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the height");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the color :");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius,color);
        System.out.println("The Circle :" + circle.toString() + "The Circle Area :" + circle.getArea());
        Cylinder cylinder = new Cylinder(radius , color , height);
        System.out.println("the Cylinder :" +cylinder.toString() + "The Cylinder Volume :" +cylinder.getVolume());
    }
}
