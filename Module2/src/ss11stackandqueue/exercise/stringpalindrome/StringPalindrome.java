package ss11stackandqueue.exercise.stringpalindrome;

import ss11stackandqueue.exercise.Queue.Queue;

import java.util.Scanner;
import java.util.Stack;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue queue = new Queue();
        System.out.println("Enter to the String");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++){
            stack.push(str);
            
        }

    }
}
