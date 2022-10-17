package ss2loopandarray.exercise;

import java.sql.Array;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number element :");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter element :");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter number delete :");
        int value = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (arr[i] == value) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        arr[arr.length - 1] = 0;
        System.out.print("Enter array new :");
        for (int i =0 ; i<number;i++){
            System.out.print(arr[i] + "\n");
        }
    }
}
