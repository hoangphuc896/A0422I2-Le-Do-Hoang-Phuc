package ss3method.exercise;

import java.util.Scanner;

public class FindMaximumTwoArray {
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
        int index1 = 0;
        int index2 = 0;
        float max = array[0][0];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("The Value biggest array :" + max + "\n" + " the index maximum :" + "[" + index1 + "]" + " " + "[" + index2 + "]");
    }
}
