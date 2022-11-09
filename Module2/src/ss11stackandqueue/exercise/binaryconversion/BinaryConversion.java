package ss11stackandqueue.exercise.binaryconversion;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConversion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = scanner.nextInt();
        while (number>0){
            stack.push(number%2);
            number /=2;
        }

        while (!stack.isEmpty()){

        }
    }

}
