package ss1introduction.exercise;

import java.util.Scanner;

public class HelloMy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Hello:" + name);
    }
}
