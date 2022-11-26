package ss14sortalgorithm.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(a[j] < a[j-1]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,7,6,2,3,4,8,5};
        InsertionSort.insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
