package ss11stackvsqueue.exercise.reverseelement;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String string = "Hello CodeGym";
        String[] mWord = string.split("");
        System.out.println(Arrays.toString(mWord));
        for (String o : mWord) {
            stack.push(o);
        }
        String outp = "";
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = stack.pop();
            outp += mWord[i];
        }
        System.out.println(outp);
    }
}
