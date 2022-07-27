package ss6inheritance.exercise.moveablepoint;

import java.util.Arrays;
import java.util.Scanner;

public class TestpointMoveable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value x :");
        float x = scanner.nextFloat();
        System.out.println("Enter the value y:");
        float y = scanner.nextFloat();
        System.out.println("Enter the speed x:");
        float xSpeed=scanner.nextFloat();
        System.out.println("Enter the speed y:");
        float ySpeed=scanner.nextFloat();
        Point arr = new Point();
        arr.setXY(x,y);
        MoveablePoint arrSpeed = new MoveablePoint();
        arrSpeed.setSpeed(xSpeed,ySpeed);
        arrSpeed.setXY(x,y);
        System.out.println("The Point:"+ Arrays.toString(arr.getXY())+"\n"+"The Speed:"+Arrays.toString(arrSpeed.getSpeed())+"\n"+"The MoveablePoint:"+arrSpeed.move());
    }
}
