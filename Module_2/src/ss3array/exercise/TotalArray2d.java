package ss3array.exercise;

import java.util.Scanner;

public class TotalArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value array 1: ");
        int size = scanner.nextInt();
        System.out.println("Enter value array 2: ");
        int size2 = scanner.nextInt();
        int array[][] = new int[size][size2];
        int total = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Enter index value: ");
                array[i][j] = scanner.nextInt();
                if (i == j) {
                    total += array[i][j];
                    continue;
                }
            }
        }
        System.out.println("Total number diagonal : " + total);
    }
}
