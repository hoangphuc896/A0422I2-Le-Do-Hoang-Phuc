package ss2loopandarray.exercise;

public class DisplayPrime {
    public static void main(String[] args) {
            for (int i = 2; i < 100; i++) {
                if(checkprime(i)){
                    System.out.println(i + "");
                }
        }
    }

    public static boolean checkprime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2){
            return true ;
        }
        for (int i=2 ;i<Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
