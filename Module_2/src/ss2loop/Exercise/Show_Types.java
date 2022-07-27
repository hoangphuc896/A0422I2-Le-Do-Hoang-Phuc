package ss2loop.exercise;

import java.util.Scanner;

public class Show_Types {
    public static void main(String[] args) {

        System.out.println("1. Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        int triangle = scanner.nextInt();
        switch (triangle) {
            case 1:
                System.out.println("Enter the height");
                int height = scanner.nextInt();
                System.out.println("Enter the weight");
                int weight = scanner.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < weight; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 2:
                System.out.println("1. Triangle top-left");
                System.out.println("2. Triangle top-right");
                System.out.println("3. Triangle botton-left");
                System.out.println("4. Triangle botton-right");
                int square = scanner.nextInt();
                System.out.println("Enter line Number");
                int number = scanner.nextInt();
                switch (square) {
                    case 1:
                        for (int i = 0; i < number; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < number; i++) {
                            for (int j = 0; j < i + 1; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < number - i; k++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < number; i++) {
                            for (int j = 0; j < number - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < i + 1; k++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    case 4:
                        for (int i = 0; i < number; i++) {
                            for (int j = 0; j < i + 1; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;

                }
            case 3:
                System.out.print("Enter line Number");
                int num = scanner.nextInt();
                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < num; j++) {
                        if (i < (num - 1) - j) {
                            System.out.print((" "));
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.print("\n");
                }
        }
    }
}
