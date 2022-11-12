package castudymodule2.validate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("20/12/1996",formatter);
        LocalDate localDate1 = LocalDate.parse("12/12/1996",formatter);
        System.out.println(localDate.compareTo(localDate1));
    }
}
