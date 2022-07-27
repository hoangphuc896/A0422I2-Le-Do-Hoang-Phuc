package ss3array.exercise;

import java.util.Scanner;

public class more_array {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        int numbers = scanner.nextInt();
        int array[] = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.print("Enter number Array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter value :");
        int index = scanner.nextInt();
        do {
            System.out.print("Enter number more array: ");
            number = scanner.nextInt();
            if (number <= 1 || number >= numbers - 1) {
                System.out.println("not number element:");

            }
        } while (number <= 1 || number >= numbers - 1);
        array[numbers - 1] = array[number];
        for (int i = 0; i < numbers; i++) {
            if (number == i) {
                array[i] = index;
            }
        }
        System.out.println("array more" + index + "element" + number + ":");
        for (int i = 0; i < numbers; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
