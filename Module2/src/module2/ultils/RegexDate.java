package module2.ultils;

import java.util.Scanner;

public class RegexDate {
    static Scanner scanner = new Scanner(System.in);

    public static String RegexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
}
