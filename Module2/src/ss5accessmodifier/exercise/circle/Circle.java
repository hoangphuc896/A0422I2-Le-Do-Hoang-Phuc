package ss5accessmodifier.exercise.circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your radius :");
        double radius = scanner.nextDouble();
        System.out.println("Enter your color");
        String color = scanner.next();
        ClassCircle circle = new ClassCircle(radius, color);
        System.out.println("The Circle :" + circle.toString());
        System.out.println("The Area :" + circle.getArea());
    }
}
