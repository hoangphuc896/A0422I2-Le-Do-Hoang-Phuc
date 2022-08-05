package ss4_class.exercise.stopwatch;

import ss4class.exercise.stopwatch.stopwatch;

import java.util.Scanner;

public class ClassStopWatch {
    public static void main(String[] args) {
       stopwatch watch = new stopwatch();
        Scanner scanner = new Scanner(System.in);
        watch.star();
        System.out.println("The time startwatch:"+ watch.getStartTime());
        scanner.nextLine();
        watch.stop();
        System.out.println("The time stopwatch:"+ watch.getEndTime());
        scanner.nextLine();
        System.out.println("the time pass"+watch.getElapsedTime()+"milisecond");


    }
}
