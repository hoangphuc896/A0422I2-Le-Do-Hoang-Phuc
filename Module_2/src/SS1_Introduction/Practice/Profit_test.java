import java.util.Scanner;

public class Profit_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf("%d is a leep year", year);
                }else {
                    System.out.printf("%d is NOT a leep year", year);
                }
            }else {
                System.out.printf("%d is a leep year", year);
            }
        }else {
            System.out.printf("%d is NOT a leep year", year);
        }
    }
}
