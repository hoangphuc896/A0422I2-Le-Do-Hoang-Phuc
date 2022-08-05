package ss3array.exercise;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number array:");
        int number = scanner.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter element array: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter number to delete: ");
        int value = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        array[array.length - 1] = 0;
        System.out.println("Enter array remaining: ");
        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + "\n");
        }
    }
}

