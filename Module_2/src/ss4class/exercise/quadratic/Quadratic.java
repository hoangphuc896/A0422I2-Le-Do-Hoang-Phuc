package ss4class.exercise.quadratic;

import java.util.Scanner;

public class  Quadratic {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter value a :");
        double a = scanner.nextDouble();
        System.out.println("Enter value b :");
        double b = scanner.nextDouble();
        System.out.println("Enter value c : ");
        double c = scanner.nextDouble();
        ClassQuadratic equatic = new ClassQuadratic(a,b,c);
        double delta = equatic.getDiscriminant();
        System.out.println("delta ="+ delta);
        if (delta>=0){
            System.out.printf("The equation has two roots : x1=%.2f , x2=%.2f",equatic.getRoot1(),equatic.getRoot2());
        }else if (delta==0){
            System.out.printf("The equation has one roots : x = %.2f",equatic.getDiscriminant());
        }else {
            System.out.println("The equation not real roots");
        }
    }
}
