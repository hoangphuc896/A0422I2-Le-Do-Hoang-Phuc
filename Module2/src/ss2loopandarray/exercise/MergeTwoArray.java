package ss2loopandarray.exercise;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 element :");
        int number1 = scanner.nextInt();
        int []arr1 = new int[number1];
        for (int i =0 ; i<number1 ; i++){
            System.out.println("Enter value arr1 :");
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Enter number2 element :");
        int number2 = scanner.nextInt();
        int []arr2 = new int[number2];
        for (int i =0 ; i<number2 ; i++){
            System.out.println("Enter value arr2 :");
            arr2[i]=scanner.nextInt();
        }

        int[]arr = new int[number1+number2];
        for (int i =0 ;i<number1;i++){
            arr[i]=arr1[i];
        }
        for (int i=0 ; i<number2 ; i++){
            arr[arr1.length+i]=arr2[i];
        }
        for (int i = 0 ; i<arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
