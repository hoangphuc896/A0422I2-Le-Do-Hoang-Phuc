package ss19stringandregex.schoolclass.validate;

import castudymodule2.ultils.AgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    public static final String FOMAT_DATE = "Bạn Nhập sai Ngày Mời Bạn nhập Lại";

    public static Date validateBirtday(String BirtdayAsString) throws AgeException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date birtDay;
        try {
            birtDay = format.parse(BirtdayAsString);
            return birtDay;
        } catch (ParseException e) {
            throw new AgeException(FOMAT_DATE);

        }
    }
}
