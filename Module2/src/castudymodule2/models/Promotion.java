package castudymodule2.models;

import java.util.Date;

public class Promotion {
    private Booking booking ;
    private Date bookingDay;
    private String voucher;

    public Promotion() {
    }

    public Promotion(Booking booking, Date bookingDay, String voucher) {
        this.booking = booking;
        this.bookingDay = bookingDay;
        this.voucher = voucher;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Date getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(Date bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "booking=" + booking +
                ", bookingDay=" + bookingDay +
                ", voucher='" + voucher + '\'' +
                '}';
    }
}
