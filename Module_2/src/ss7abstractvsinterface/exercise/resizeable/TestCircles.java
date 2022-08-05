package ss7abstractvsinterface.exercise.resizeable;

import java.util.Scanner;

public class TestCircles {
    public static void main(String[] args) {
        Circles circles = new Circles();
        System.out.println(circles);
        circles = new Circles(4.5);
        System.out.println(circles);
        circles = new Circles(2.3, "yelow", false);
        System.out.println(circles);
    }
}