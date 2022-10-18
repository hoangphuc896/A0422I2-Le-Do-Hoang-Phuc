package ss4classvsobiject.exercise.quadratic;

import java.util.Scanner;

public class TestQuaratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value a :");
        double a = scanner.nextDouble();
        System.out.println("Enter Value b :");
        double b = scanner.nextDouble();
        System.out.println("Enter Value c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        double delta = quadratic.getDiscriminant();
        System.out.println("delta" + delta);
        if (delta >= 0) {
            System.out.printf("the equation has two roots: x1= %.2f , x2 = %.2f",quadratic.getRoot1(),quadratic.getRoot2());
        }else if(delta==0){
            System.out.printf("the equation has one roots: x=%.2f"+quadratic.getDiscriminant());
        }else {
            System.out.println("the equation not real roots ");
        }
    }
}
