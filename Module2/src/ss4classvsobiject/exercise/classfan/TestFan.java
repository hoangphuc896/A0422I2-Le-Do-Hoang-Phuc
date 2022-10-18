package ss4classvsobiject.exercise.classfan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3 , true ,10 ,"Yellow");
        ClassFan fan2 = new ClassFan(2 , false , 5 ,"blue");
        System.out.println(" The Fan1" + fan1.toString());
        System.out.println("The Fan2" + fan2.toString());
    }
}
