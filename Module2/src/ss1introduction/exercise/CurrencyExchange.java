package ss1introduction.exercise;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000 ;
        double usd ;
        System.out.println("Enter money exchange :");
        usd = scanner.nextDouble();
        double exchange = usd * vnd ;
        System.out.println("exchange :" + exchange);
    }
}
