package ss12javacollection.product.data.regex;

import castudymodule2.ultils.AgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexAndValidate {
    static Scanner scanner = new Scanner(System.in);
    // công thức xử lý định dạng các thông tin bằng chuỗi String
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


    public static Date birthDay(String BirthDayStr) throws AgeException {
        // công thức xử lý lỗi định dạng ngày tháng năm sinh cho đúng
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);// để người dùng nhập đúng ngày tháng năm sinh
        Date birthDay ;
        try {
            birthDay = format.parse(BirthDayStr);
            return birthDay;
        } catch (ParseException e) {
          throw new AgeException(Message.MESSAGE_BIRTHDAY); //  tin nhắn nhắc nhở để cho người dùng nhập lại
        }
    }
}
