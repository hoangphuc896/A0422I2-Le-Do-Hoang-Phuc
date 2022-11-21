package castudymodule2.ultils;

import castudymodule2.models.Booking;
import castudymodule2.services.lmpl.BookingServicelmpl;
import castudymodule2.validate.Validator;

import java.util.Date;
import java.util.Scanner;

public class RegexPromotion {
    private static Scanner scanner = new Scanner(System.in);

    public Booking chooseBooking() {
        System.out.println("danh Sách Khách Hàng :");
        for (Booking booking : BookingServicelmpl.bookingSet) {
            System.out.println(booking.toString());
        }
        System.out.println("Mời Bạn Chọn Khách Hàng Được Hưởng Khuyến Mãi :");
        int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            for (Booking booking : BookingServicelmpl.bookingSet) {
                if (id == booking.getIdBooking()) {
                    return booking;
                } else {
                    System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
                }
            }
        }
    }

    public Date bookingDay() {
        Date bookDay;
        do {
            System.out.println("Mời Bạn Nhập Thời Gian Thuê");
            String bookingDay = scanner.nextLine();
            try {
                bookDay = Validator.validateBookingDay(bookingDay);
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập Sai Định Dạng Mời Bạn Nhập Lại");
            }
        } while (true);
        return bookDay;
    }
}
