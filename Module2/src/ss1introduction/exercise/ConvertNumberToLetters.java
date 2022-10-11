package ss1introduction.exercise;

import java.util.Scanner;

public class ConvertNumberToLetters {
    public static String readNumber(int number) {
        String read = "";
        switch (number) {
            case 0:
                read = "Zero";
                break;
            case 1:
                read = "One";
                break;
            case 2:
                read = "Two";
                break;
            case 3:
                read = "Three";
                break;
            case 4:
                read = "Four";
                break;
            case 5:
                read = "Five";
                break;
            case 6:
                read = "Six";
                break;
            case 7:
                read = "Seven";
                break;
            case 8:
                read = "Eight";
                break;
            case 9:
                read = "Nine";
                break;
            case 10:
                read = "Ten";
        }
        return read;
    }

    public static String readNumberTwo(int number) {
        String readNumberTwo = "";
        switch (number) {
            case 0:
                readNumberTwo = "";
                break;
            case 1:
                readNumberTwo = "One";
                break;
            case 2:
                readNumberTwo = "Twenty";
                break;
            case 3:
                readNumberTwo = "Thirty";
                break;
            case 4:
                readNumberTwo = "Fourty";
                break;
            case 5:
                readNumberTwo = "Fifty";
                break;
            case 6:
                readNumberTwo = "Sixty";
                break;
            case 7:
                readNumberTwo = "Seventy";
                break;
            case 8:
                readNumberTwo = "Eighty";
                break;
            case 9:
                readNumberTwo = "Ninety";
                break;
        }
        return readNumberTwo;
    }

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            System.out.println(readNumber(number));

        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                default:
                    int ten = number / 10;
                    System.out.println(readNumber(ten) + "teen");
            }

        } else if (number >= 20 && number < 100) {
            int ten = number / 10;
            int donvi = number % 10;
            System.out.println(readNumberTwo(ten) + readNumber(donvi));

        } else if (number >= 100 && number < 1000) {
            int hundred = number / 100;
            int ten = (number % 100) / 10;
            int donvi = (number % 100) % 10;

            if (number <= 119) {
                System.out.println(readNumber(hundred) + " Hundred And " + readNumber(donvi) + "teen");
            } else {
                System.out.println(readNumber(hundred) + " Hundred And " + readNumberTwo(ten) + " " + readNumber(donvi));
            }
        } else {
            System.out.println(" Out of ability ");
        }

    }
}