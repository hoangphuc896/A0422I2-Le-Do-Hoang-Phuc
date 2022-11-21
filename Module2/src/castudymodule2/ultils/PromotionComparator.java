package castudymodule2.ultils;

import castudymodule2.models.Promotion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Comparator;
import java.util.List;

public class PromotionComparator implements Comparator<Promotion> {
    @Override
    public int compare(Promotion o1, Promotion o2) {
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bookDay1 = LocalDate.parse((CharSequence) o1.getBookingDay(), formatter );
        LocalDate bookDay2 = LocalDate.parse((CharSequence) o2.getBookingDay(),formatter);

        if (bookDay1.compareTo(bookDay2)>0){
            return 1;
        }else if (bookDay1.compareTo(bookDay2)<0){
            return -1;
        }else {
            return 0;
        }
    }
}
