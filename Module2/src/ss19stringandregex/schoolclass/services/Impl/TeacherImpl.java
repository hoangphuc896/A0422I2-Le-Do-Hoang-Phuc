package ss19stringandregex.schoolclass.services.Impl;

import ss19stringandregex.schoolclass.model.Teacher;
import ss19stringandregex.schoolclass.services.TeacherService;
import ss19stringandregex.schoolclass.ultils.ReadAndWrite;
import ss19stringandregex.schoolclass.ultils.RegexPerson;

import ss19stringandregex.schoolclass.ultils.TeacherComparator;


import java.util.*;

public class TeacherImpl implements TeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        teacherList = ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        for (Teacher teacher:teacherList){
            System.out.println(teacher.toString());
        }
        int id = RegexPerson.inputID();
        boolean isExisted = false;
        for (Teacher teacher:teacherList) {
            if (teacher.getId() == id) {
                teacher.setName(RegexPerson.inputName());
                teacher.setBirthDay(RegexPerson.inputBirthDay());
                teacher.setPosition(RegexPerson.inputPosition());
                isExisted = true;
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            for (Teacher teacher: teacherList){
                System.out.println(teacher.toString());
            }
        }
        ReadAndWrite.writeTeacher(teacherList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
    }

    @Override
    public void delete() {
        teacherList=ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        for (Teacher teacher:teacherList){
            System.out.println(teacher.toString());
        }
        int id = RegexPerson.inputID();
        Teacher teachers = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                teachers = teacher;
                break;
            }
        }
        if (teachers != null) {
            teacherList.remove(teachers);
            System.out.println("Delete product");
            for (Teacher teacher : teacherList) {
                System.out.println(teacher.toString());
            }
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        ReadAndWrite.writeTeacher(teacherList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
    }

    @Override
    public void search() {
        teacherList = ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        for (Teacher teacher : teacherList){
            System.out.println(teacher.toString());
        }
        String name = RegexPerson.inputName();
        Teacher teachers = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getName().equals(name)) {
                teachers = teacher;
                break;
            }
        }
        if (teachers != null) {
            System.out.println("product you are looking for" + teachers);
        } else {
            System.out.println("Not product in list :" + name);
        }
    }

    @Override
    public void display(){
        teacherList=ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        System.out.println("Teacher List :");
        for (Teacher teacher : teacherList){
            System.out.println(teacher.toString());
        }
    }

    @Override
    public void sort(){
        teacherList = ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        Collections.sort(teacherList,new TeacherComparator());
        for (Teacher teacher:teacherList){
            System.out.println(teacher.toString());
        }
        ReadAndWrite.writeTeacher(teacherList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
    }

    @Override
    public void addNew() {
        teacherList=ReadAndWrite.readTeacher("D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
        int id= RegexPerson.inputID();
        String name = RegexPerson.inputName();
        Date birthDay=RegexPerson.inputBirthDay();
        String position = RegexPerson.inputPosition();
        Teacher teacher = new Teacher(id, name, birthDay, position);
        teacherList.add(teacher);
        ReadAndWrite.writeTeacher(teacherList,"D:\\Codegym\\Module2\\src\\ss19stringandregex\\schoolclass\\data\\Teacher.csv");
    }
}
