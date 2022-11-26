package ss13searchalgorithm.exercise;

public class BinaryTreeSearchDQ {
    public static int binaryTreeSearchDQ(int[] a, int x, int left, int right) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (a[mid] > x) {
            return binaryTreeSearchDQ(a, x, left, right = mid-1);
        }else if(a[mid] < x){
            return binaryTreeSearchDQ(a, x, left = mid+1, right);
        }else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[]  a = {2,3,4,56,457,2342,7,34,4545,54,23234,44444};
        System.out.println(binaryTreeSearchDQ(a,4 ,0,a.length-1));
        System.out.println(binaryTreeSearchDQ(a,23234 ,0,a.length-1));
        System.out.println(binaryTreeSearchDQ(a,44444 ,0,a.length-1));
    }
}
