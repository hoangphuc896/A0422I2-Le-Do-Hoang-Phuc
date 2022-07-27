package ss3array.exercise;

import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array 1");
        int size1 = scanner.nextInt();
        int array1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter value array1: ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter length array 2");
        int size2 = scanner.nextInt();
        int array2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter value array2:");
            array2[i] = scanner.nextInt();
        }
        int size3 = size1 + size2;
        int array3[] = new int[size3];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("The array 3 after merge");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ",");
        }
    }
}
