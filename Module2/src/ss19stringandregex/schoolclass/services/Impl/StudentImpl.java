package ss19stringandregex.schoolclass.services.Impl;

import ss19stringandregex.schoolclass.model.Student;
import ss19stringandregex.schoolclass.services.StudentService;
import ss19stringandregex.schoolclass.ultils.ReadAndWrite;
import ss19stringandregex.schoolclass.ultils.RegexPerson;
import ss19stringandregex.schoolclass.ultils.StudentComparator;
import java.util.*;

public class StudentImpl implements StudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        studentList = ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
        for (Student student : studentList){
            System.out.println(student.toString());
        }
        int id = RegexPerson.inputID();
        boolean isExisted = false;
        for (Student student:studentList) {
            if (student.getId() == id) {
                student.setName(RegexPerson.inputName());
                student.setBirthDay(RegexPerson.inputBirthDay());
                student.setClassification(RegexPerson.inputClassification());
                isExisted = true;
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            for (Student student : studentList){
                System.out.println(student.toString());
            }
        }
        ReadAndWrite.writeStudent(studentList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
    }

    @Override
    public void delete() {
        studentList= ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
        for (Student student : studentList){
            System.out.println(student.toString());
        }
        int id = RegexPerson.inputID();
        Student students = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                students = student;
                break;
            }
        }
        if (students != null) {
            studentList.remove(students);
            System.out.println("Delete product");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        ReadAndWrite.writeStudent(studentList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
    }

    @Override
    public void search() {
        studentList =ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        for (Student student : studentList){
            System.out.println(student.toString());
        }
        String name = RegexPerson.inputName();
        Student students = null;
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                students = student;
                break;
            }
        }
        if (students != null) {
            System.out.println("product you are looking for" + students);
        } else {
            System.out.println("Not product in list :" + name);
        }
    }

    @Override
    public void display(){
        studentList = ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
        System.out.println("Student List :");
        for (Student student : studentList){
            System.out.println(student.toString());
        }
    }

    @Override
    public void sort() {
        ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
        Collections.sort(studentList,new StudentComparator());
        for (Student student:studentList){
            System.out.println(student.toString());
        }
        ReadAndWrite.writeStudent(studentList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
    }

    @Override
    public void addNew() {
        ReadAndWrite.readStudent("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
        int id= RegexPerson.inputID();
        String name = RegexPerson.inputName();
        Date birthDay=RegexPerson.inputBirthDay();
        String classification = RegexPerson.inputClassification();
        Student student = new Student(id, name, birthDay, classification);
        studentList.add(student);
        ReadAndWrite.writeStudent(studentList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Student.csv");
    }
}
