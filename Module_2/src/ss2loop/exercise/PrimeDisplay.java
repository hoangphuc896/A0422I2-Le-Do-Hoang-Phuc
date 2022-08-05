package ss2loop.exercise;

import java.util.Scanner;

public class PrimeDisplay {
    public static void main(String[] args) {
        System.out.println("Enter you the Prime");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d number prime first: \n", number );
        int count = 0;
        int i = 2;
        while (count <=20) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
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
