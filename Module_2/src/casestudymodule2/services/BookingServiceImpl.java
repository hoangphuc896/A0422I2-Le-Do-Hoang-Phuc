package casestudymodule2.services;

import casestudymodule2.exception.UserException;
import casestudymodule2.models.Booking;
import casestudymodule2.models.Customer;
import casestudymodule2.models.Facility;
import casestudymodule2.ultils.BookingComarator;
import casestudymodule2.validate.Validator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComarator());

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("nhập ngày bắt đầu thuê:");
        String starDate ;
        try {
            starDate = scanner.nextLine();
        }catch (NumberFormatException e){
            System.out.println("bạn nhập sai định dạng , Mời bạn nhập lại");
            starDate = scanner.nextLine();
        }
        System.out.println("nhập ngày trả phòng:");

        String endDate ;
        try {
            endDate = scanner.nextLine();
        }catch (NumberFormatException e ){
            System.out.println("bạn nhập sai định dạng , Mời bạn nhập lại");
            endDate = scanner.nextLine();
        }
        Booking booking = new Booking(id, starDate, endDate, customer, facility);

        bookingSet.add(booking);
        if (countBooking(facility.getIdFacility()) == 5) {
            FacilityServiceImpl.listFacilityMaintain.put(facility.getIdFacility(), facility);
        }
        System.out.println("Đã booking thành công");

    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng : ");
        for (Customer customer : CustomerServiceImpl.customers) {
            System.out.println(customer.toString());
        }
        System.out.println("nhập id khách hàng : ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            for (Customer customer : CustomerServiceImpl.customers) {
                if (id == customer.getId()) {
                    return customer;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại id khách hàng :");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ : ");
        for (Map.Entry<Facility, Integer> entry : FacilityServiceImpl.facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhập id dịch vụ : ");
        boolean check = false;
        String id = scanner.nextLine();
        while (true) {
            check = false;
            for (Map.Entry<Facility, Integer> entry : FacilityServiceImpl.facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    if (FacilityServiceImpl.listFacilityMaintain.containsKey(id)) {
                        check = true;
                    } else {
                        return entry.getKey();
                    }
                }
            }

            if (check) {
                System.out.println("Dich vu nay dang duoc bao tri, vui lòng nhập lại id dịch vụ khac:");
            } else {
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại id dịch vụ :");
            }
            id = scanner.nextLine();
        }
    }

    public int countBooking(String id) {
        int count = 0;
        for (Booking booking : BookingServiceImpl.bookingSet) {
            if (id == booking.getFacility().getIdFacility()) {
                count++;
            }
        }
        return count;
    }
}
