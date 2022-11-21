package castudymodule2.ultils;

import castudymodule2.models.Booking;
import castudymodule2.models.Customer;
import castudymodule2.models.Facility;
import castudymodule2.models.Villa;
import castudymodule2.services.lmpl.BookingServicelmpl;
import castudymodule2.services.lmpl.CustomerServiceImpl;
import castudymodule2.services.lmpl.FacilityServiceImpl;
import castudymodule2.validate.Validator;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class RegexBooking {
    private static final Scanner scanner = new Scanner(System.in);


    public static Date bookingStarTime() {
        Date bookTime;
        do {
            System.out.println("Mời Bạn Nhập Thời Gian bắt đầu Booking :");
            String book = scanner.nextLine();
            try {
                bookTime = Validator.validateBookingtime(book);
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập sai ngày mời bạn nhập lại");
            }
        } while (true);
        return bookTime;
    }

    public static Date bookingEndTime() {
        Date bookTime;
        do {
            System.out.println("Mời Bạn Nhập Thời Gian bắt đầu Booking :");
            String book = scanner.nextLine();
            try {
                bookTime = Validator.validateBookingtime(book);
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập sai ngày mời bạn nhập lại");
            }
        } while (true);
        return bookTime;
    }

    public static Facility bookFacility() {
        System.out.println("Mời bạn chọn danh sách :");
        for (Map.Entry<Facility, Integer> entry : FacilityServiceImpl.facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Mời Bạn Nhập ID :");
        boolean check;
        String id = scanner.nextLine();
        while (true) {
            check = false;
            for (Map.Entry<Facility, Integer> entry : FacilityServiceImpl.facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    if (FacilityServiceImpl.facilityIntegerMap.containsKey(id)) {
                        check = true;
                    } else {
                        return entry.getKey();
                    }
                }
            }
            if (check) {
                System.out.println("Danh Sách Đã Được Bảo Trì Mời Bạn Nhập Lại");
            } else {
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại id dịch vụ :");
            }
            id = scanner.nextLine();
        }
    }

    public static Customer bookCustomer() {
        System.out.println("Mời bạn chon danh sách :");
        for (Customer customer : CustomerServiceImpl.customerList) {
            System.out.println(customer.toString());
        }
        String id = scanner.nextLine();
        while (true) {
            for (Customer customer : CustomerServiceImpl.customerList) {
                if (id.equals(customer.getId())) {
                    return customer;
                } else {
                    System.out.println("Bạn nhập sai , vui lòng nhập lại id :");
                }
            }
        }
    }

    public static int countBooking(String id) {
        int count = 0;
        for (Booking booking : BookingServicelmpl.bookingSet) {
            if (Objects.equals(id, booking.getFacility().getIdFacility())) {
                count++;
            }
        }
        return count;
    }

}
