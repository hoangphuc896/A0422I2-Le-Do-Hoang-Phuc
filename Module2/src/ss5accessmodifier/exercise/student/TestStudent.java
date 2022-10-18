package ss5accessmodifier.exercise.student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Classe :");
        String classe = scanner.nextLine();
        ClassStudent student = new ClassStudent(name , classe);
        System.out.println("The information :" + student.toString());
    }
}
