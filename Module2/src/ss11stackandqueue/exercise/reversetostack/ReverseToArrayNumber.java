package ss11stackandqueue.exercise.reversetostack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseToArrayNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to size Array");
        int size = scanner.nextInt();
        Integer[] number = new Integer[size];
        for (int i = 0; i < number.length; i++){
            System.out.println("Enter the value number to array :");
            number[i]= scanner.nextInt();
            stack.push(number[i]);
        }
        System.out.println("Array before to reverse :" + Arrays.toString(number));
        for (int i=0;i<number.length;i++){
            number[i]=stack.pop();
        }
        System.out.println("Array after to reverse :"+ Arrays.toString(number));
    }
}
