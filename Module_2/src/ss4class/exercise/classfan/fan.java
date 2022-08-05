package ss4class.exercise.classfan;

public class fan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3,true,10,"yellow");
        ClassFan fan2 = new ClassFan(2,false,5,"blue");
        System.out.println("Fan1:"+fan1.toString());
        System.out.println("Fan2:"+fan2.toString());
    }
}
