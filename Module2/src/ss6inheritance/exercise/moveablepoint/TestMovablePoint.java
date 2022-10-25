package ss6inheritance.exercise.moveablepoint;

import java.util.Scanner;

public class TestMovablePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value x :");
        float x = scanner.nextFloat();
        System.out.println("Enter Value y :");
        float y = scanner.nextFloat();
        System.out.println("Enter Value xSpeed :");
        float xSpeed = scanner.nextFloat();
        System.out.println("Enter Value ySpeed :");
        float ySpeed = scanner.nextFloat();
        Point point = new Point(x, y);
        System.out.println("The Array Point :" + point.toString());
        MovablePoint movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println("The Array MovablePoint :" + movablePoint.toString() + "\n" + "The Move MovablePoint :" + movablePoint.move());
    }
}
