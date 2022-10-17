package ss3method.exercise;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element value :" + i);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("the min array :" + min);
    }
}
