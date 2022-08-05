package ss5accessmodifier.exercise.accessmodifier;

import ss5_Accessmodifier.exercise.accessmodifier.ClassStudent;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The your to name:");
        String name = scanner.nextLine();
        System.out.printf("The your to class:");
        String classed = scanner.nextLine();
        ClassStudent strings =new ClassStudent();
        strings.setName(name);
        strings.setClasses(classed);
        System.out.println("The Name:"+strings.getName()+"\n"+"The Class:"+strings.getClasses());
    }
}
