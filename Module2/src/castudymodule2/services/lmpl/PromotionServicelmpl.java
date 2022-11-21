package castudymodule2.services.lmpl;

import castudymodule2.models.Booking;
import castudymodule2.models.Promotion;
import castudymodule2.services.PromotionService;
import castudymodule2.ultils.BookingComparator;
import castudymodule2.ultils.PromotionComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServicelmpl implements PromotionService {
    private static Scanner scanner = new Scanner(System.in);
    private static final Set<Promotion> promotions = new TreeSet<>(new PromotionComparator());

    @Override
    public void displayCustomerVoucher() {

    }

    @Override
    public void displayList() {
        System.out.println("danh sách Khách Hàng :");
        for (Booking booking : BookingServicelmpl.bookingSet) {
            System.out.println(booking.toString());
        }
    }

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
                }else {
                    System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
                }
            }
        }
    }
    public void voucher(){
        BookingServicelmpl bookingServicelmpl = new BookingServicelmpl();
        Stack voucher = new Stack();

    }





    public void addPromotion(){
        Booking booking = chooseBooking();

    }


}
