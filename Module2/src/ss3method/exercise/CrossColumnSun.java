package ss3method.exercise;

import java.util.Scanner;

public class CrossColumnSun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element value :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        float[][] array = new float[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.println("Enter value :");
                array[i][j] = scanner.nextFloat();
            }
        }
        int column = 0;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                if (i == j) {
                    column += array[i][j];
                }
            }
        }
        System.out.println("The Cross column Sun :" + column);
    }
}
