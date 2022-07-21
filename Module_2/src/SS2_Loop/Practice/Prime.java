package SS2_Loop.Practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        if (checkPrime(Number)){
            System.out.println(Number + "a number prime");
        }else {
            System.out.println(Number + "a not number prime");
        }
    }

    public static boolean checkPrime(int Number) {
        if (Number < 2) {
            return false;
        }
        if (Number == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(Number); i++) {
            if (Number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
