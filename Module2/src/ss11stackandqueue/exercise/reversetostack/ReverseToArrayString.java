package ss11stackandqueue.exercise.reversetostack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseToArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Enter to String Array :");
        String mWord = scanner.nextLine();//Hello
        String[] str = mWord.split("");
        for (String o : str){
            stack.push(o);
        }
        System.out.println("Array to before stack :" + stack);
        String outp = "";
        for (int i=0;i<mWord.length();i++){
            str[i]=stack.pop();
            outp += str[i];
        }
        System.out.println("Array to after stack : " + outp);
    }
}
