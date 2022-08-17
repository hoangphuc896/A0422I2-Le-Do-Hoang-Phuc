package ss11stackvsqueue.exercise.reverseelement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        Integer[] number = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Type element %d: ", i);
            number[i] = scanner.nextInt();
            stack.push(number[i]);
        }
        System.out.println("Array before reverse: " + Arrays.toString(number));
        for (int i = 0; i < size; i++) {
            number[i] = (Integer) stack.pop();
        }
        System.out.println("Array after reverse: " + Arrays.toString(number));
    }
}
