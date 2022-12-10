package ss19stringandregex.schoolclass.controllers;

import ss19stringandregex.schoolclass.services.Impl.StudentImpl;
import ss19stringandregex.schoolclass.services.Impl.TeacherImpl;
import java.util.Scanner;

public class ClassControllers {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("1. Teacher Management");
            System.out.println("2. Student Management");
            System.out.println("3. Exit");
            System.out.println("Choose from 1-3");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    disPlayTeacherMenu();
                    break;
                case 2:
                    disPlayStudentMenu();
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

    public static void disPlayTeacherMenu() {
        TeacherImpl teacher = new TeacherImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Teacher");
            System.out.println("2. Add new Teacher");
            System.out.println("3. Edit Teacher");
            System.out.println("4. Delete Teacher");
            System.out.println("5. Search Teacher");
            System.out.println("6. Sort Teacher");
            System.out.println("7. Return main menu");
            System.out.println("Choose from 1-7");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    teacher.display();
                    break;
                case 2:
                    teacher.addNew();
                    break;
                case 3:
                    teacher.edit();
                    break;
                case 4:
                    teacher.delete();
                    break;
                case 5:
                    teacher.search();
                    break;
                case 6:
                    teacher.sort();
                    break;
                case 7:
                    return;
            }
        }
    }

    public static void disPlayStudentMenu() {
        StudentImpl student = new StudentImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Student");
            System.out.println("2. Add new Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Sort Student");
            System.out.println("7. Return main menu");
            System.out.println("Choose from 1-7");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    student.display();
                    break;
                case 2:
                    student.addNew();
                    break;
                case 3:
                    student.edit();
                    break;
                case 4:
                   student.delete();
                   break;
                case 5:
                    student.search();
                    break;
                case 6:
                    student.sort();
                    break;
                case 7:
                    return;
            }
        }
    }
}
