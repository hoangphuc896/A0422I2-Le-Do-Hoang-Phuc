package casestudymodule2.ultils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
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

    public static String regexAge (String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(temp, regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int curent = Period.between(age, now).getYears();
                    if (curent < 100 && curent > 18) {
                        check = false;

                    } else {
                        throw new AgeException("Tuổi phải lơn 18 và bé hơn 100");
                    }
                } else {
                    throw new AgeException("Định dạng nhập vào ko đúng");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
