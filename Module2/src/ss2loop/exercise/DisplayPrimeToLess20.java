package ss2loop.exercise;

import java.util.Scanner;

public class DisplayPrimeToLess20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; count < number; i++) {
            if (checkPrime(i)){
                System.out.print( i + " ");
                count++;
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return false;

        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
