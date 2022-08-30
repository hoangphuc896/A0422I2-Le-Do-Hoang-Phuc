package ss14sortalgorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ShowInsertionSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type number of elements: ");
        byte size = scanner.nextByte();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Type number index %d: ", i);
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }

        }
    }

}
