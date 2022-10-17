package ss3method.exercise;

import java.util.Scanner;

public class SunOneColumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element value :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        float[][] array = new float[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.println("Enter value :" + i + " " + j);
                array[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("Enter index :");
        int index = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
               if (i==index){
                   total += array[index][j];
               }
            }
        }
        System.out.println("Enter total sun one column :" + total);
    }
}
