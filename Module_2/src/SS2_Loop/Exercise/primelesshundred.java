package SS2_Loop.Exercise;

import java.util.Scanner;

public class primelesshundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number less hundred: ");
        int number = scanner.nextInt();
        System.out.printf("%d number prime less hundred :\n", number);
        int i = 2;
        while (i < 100) {
            if(checkPrime(i)){
                System.out.print(i + " ");
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