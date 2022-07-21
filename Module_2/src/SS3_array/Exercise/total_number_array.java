package SS3_array.Exercise;

import java.util.Scanner;

public class total_number_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value array 1: ");
        int size = scanner.nextInt();
        System.out.println("Enter value array 2: ");
        int size2 = scanner.nextInt();
        int array[][] = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Enter index value: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter total column : ");
        int column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][column];
        }
        System.out.println("The total of number in column :" + column + ":" + sum);
    }
}
