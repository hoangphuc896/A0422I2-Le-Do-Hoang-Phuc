package ss2loopandarray.exercise;

import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number element :");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        int index ;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter index :");
            arr[i] = scanner.nextInt();
        }
        do {
            System.out.println("Enter insert index :");
            index = scanner.nextInt();
            if (index<=1||index>=arr.length-1){
                System.out.println("No insert array");
            }
        }while (index<=1||index>=number-1);
        System.out.println("Enter insert value :");
        int value = scanner.nextInt();
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + "\n");
        }
    }
}
