package castudymodule2.services.lmpl;

import castudymodule2.models.Booking;
import castudymodule2.models.Customer;
import castudymodule2.models.Facility;
import castudymodule2.services.BookingService;
import castudymodule2.ultils.BookingComparator;
import castudymodule2.ultils.ReadAndWrite;
import castudymodule2.ultils.RegexBooking;

import java.util.*;

public class BookingServicelmpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());


    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Date bookStarTime = RegexBooking.bookingStarTime();
        Date bookEndTime = RegexBooking.bookingEndTime();
        Facility facility = RegexBooking.bookFacility();
        Customer customer = RegexBooking.bookCustomer();
        Booking booking = new Booking(id ,bookStarTime,bookEndTime,customer,facility);
        bookingSet.add(booking);
        ReadAndWrite.write(bookingSet,"D:\\Codegym\\Module2\\src\\castudymodule2\\data\\booking.csv");
        if (RegexBooking.countBooking(facility.getIdFacility())==5){
            FacilityServiceImpl.listFacilityMaintain.put(facility, facility.getIdFacility());
            ReadAndWrite.write((Collection) FacilityServiceImpl.listFacilityMaintain,"D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitilymaintain.csv");
        }
    }

    @Override
    public void displayList() {
        bookingSet = (Set<Booking>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\booking.csv");
        for (Booking booking : bookingSet){
            System.out.println(booking.toString());
        }
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }
}
