package ss3array.exercise;

import java.util.Scanner;

public class smallest_value_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size value: ");
        int size = scanner.nextInt();
        int value[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter index:" + (i + 1));
            value[i] = scanner.nextInt();
        }
        int min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (min > value[i]) {
                min = value[i];
            }
        }
        System.out.println("the value min: " + min);
    }
}
