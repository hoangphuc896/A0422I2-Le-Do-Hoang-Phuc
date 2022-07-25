package ss4_class.exercise.classfan;

public class fan {
    public static void main(String[] args) {
        class_fan fan1 = new class_fan(3,true,10,"yellow");
        class_fan fan2 = new class_fan(2,false,5,"blue");
        System.out.println("Fan1:"+fan1.toString());
        System.out.println("Fan2:"+fan2.toString());
    }
}
