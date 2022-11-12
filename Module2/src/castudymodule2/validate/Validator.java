package castudymodule2.validate;

import castudymodule2.ultils.AgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {
    public static Date validateBirtday(String BirtdayAsString) throws AgeException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date birtDay;
        try {
            birtDay = format.parse(BirtdayAsString);
            Date now = new Date();
            if (now.getYear() - birtDay.getYear() < 18 || now.getYear() - birtDay.getYear() > 100) {
                throw new AgeException(Message.AGE_LESS_THAN);
            }
            return birtDay;
        } catch (ParseException e) {
            throw new AgeException(Message.DATE_FORMAT);

        }

    }
}
