package ss5_Accessmodifier.exercise.accessmodifier;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The your to name:");
        String name = scanner.nextLine();
        System.out.printf("The your to class:");
        String classed = scanner.nextLine();
        class_student strings =new class_student();
        strings.setName(name);
        strings.setClasses(classed);
        System.out.println("The Name:"+strings.getName()+"\n"+"The Class:"+strings.getClasses());
    }
}
