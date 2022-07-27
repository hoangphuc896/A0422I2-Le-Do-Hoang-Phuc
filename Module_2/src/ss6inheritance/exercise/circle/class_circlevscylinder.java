package ss6inheritance.exercise.circle;

import java.util.Scanner;

public class class_circlevscylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the Height:");
        double height = scanner.nextDouble();
        System.out.println("Enter the Color:");
        String color = scanner.next();
        circle area = new circle();
        area.setRadius(radius);
        area.getArea();
        cylinder volume= new cylinder();
        volume.setHeight(height);
        volume.setRadius(radius);
        volume.getVolume();
        volume.setColor(color);
        volume.getColor();
        System.out.println("color:"+ volume.getColor()+"\n"+"area:"+area.getArea()+"\n"+"volume:"+volume.getVolume());
    }
}
