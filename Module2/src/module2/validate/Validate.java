package module2.validate;

import castudymodule2.ultils.AgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    public static final String FOMAT_DATE="Mời Bạn Nhập Lại ngày";
    public static Date validateCreatedate(String createDateStr) throws AgeException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date createDate;
        try {
            createDate = format.parse(createDateStr);
            return createDate;
        } catch (ParseException e) {
            throw new AgeException(FOMAT_DATE);
        }
    }
}
