package ss4classvsobiject.exercise.stopwatch;

import java.util.Scanner;

public class TestWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        watch.star();
        System.out.println("The Star Watch :" + watch.getStarTime());
        scanner.nextLine();
        watch.end();
        System.out.println("The End Watch : " + watch.getEndTime());
        scanner.nextLine();
        System.out.println("The Elapsed Watch :" + watch.getElapsedTime());
    }
}

