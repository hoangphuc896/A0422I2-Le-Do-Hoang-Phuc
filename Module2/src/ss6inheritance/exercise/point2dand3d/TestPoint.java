package ss6inheritance.exercise.point2dand3d;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value X :");
        float x = scanner.nextFloat();
        System.out.println("Enter value Y :");
        float y = scanner.nextFloat();
        System.out.println("Enter value Z :");
        float z = scanner.nextFloat();
        Point2d point2d = new Point2d(x , y);
        System.out.println("The Array Point2d :" + point2d.toString());
        Point3d point3d = new Point3d(x ,y, z);
        System.out.println("The Array Pooint3d :" + point3d.toString());
    }
}
