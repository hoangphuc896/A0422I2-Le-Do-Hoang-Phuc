package ss3array.exercise;

import java.util.Scanner;

public class two_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number array");
        int size = scanner.nextInt();
        System.out.println("Enter number array2");
        int size2=scanner.nextInt();
        int arr[][]= new int[size][size2];
        for (int i=1;i<size;i++){
            for (int j=1;j<size2;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        int max =arr[0][0];
        for (int i=0;i<size;i++){
            for(int j=0;j<size2;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("the value biggest array:"+max);
    }
}
