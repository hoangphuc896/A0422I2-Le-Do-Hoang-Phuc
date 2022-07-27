package ss6inheritance.exercise.point;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to the x:");
        float x = scanner.nextFloat();
        System.out.println("Enter to the y:");
        float y = scanner.nextFloat();
        System.out.println("Enter to the z:");
        float z = scanner.nextFloat();
        Point2d arr = new Point2d();
        arr.setXY(x,y);
        arr.getXY();
        Point3d arr2=new Point3d();
        arr2.setXYZ(x,y,z);
        arr2.getXYZ();
        System.out.println("The point2d:"+ Arrays.toString(arr.getXY()) +"\n"+"The point3d:"+Arrays.toString(arr2.getXYZ()));


    }
}
