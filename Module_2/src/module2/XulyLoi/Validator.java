package module2.XulyLoi;

import casestudymodule2.exception.UserException;
import casestudymodule2.validate.Message;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {
     public static Date NgayThang (String NgayThangChuoiChu) throws XuLyLoaiNgoaiLe {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date Ngay = null;
        try {
            Ngay = format.parse(NgayThangChuoiChu);

            return Ngay;
        } catch (ParseException e) {
            throw new XuLyLoaiNgoaiLe(TinNhan.TIN_NHAN);
        }
    }
}
