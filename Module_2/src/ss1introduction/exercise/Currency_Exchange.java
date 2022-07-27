package ss1introduction.exercise;

import java.util.Scanner;

public class Currency_Exchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your money USD: ");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.print("Value VND: " + exchange);
    }
}
