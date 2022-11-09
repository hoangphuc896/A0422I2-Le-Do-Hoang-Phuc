package casestudymodule2.validate;

import casestudymodule2.exception.UserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Validator {
    public static Date ValidateBirthday(String BirthdayAsString) throws UserException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date birthday;
        try {
            birthday = format.parse(BirthdayAsString);
            Date now = new Date();
            if (now.getYear() - birthday.getYear() < 18){
                    throw new UserException(Message.AGE_LESS_THAN_18);
            }
            return birthday;
        } catch (ParseException e) {
            throw new UserException(Message.DATE_FORMAT);
        }
    }
    public static Date ValidateBooking(String BookingAsString) throws UserException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date booking ;
        try {
            booking = format.parse(BookingAsString);
            return booking;
        }
        catch (ParseException e) {
            throw new UserException(Message.RENTAL_TIME);
        }
    }
}
