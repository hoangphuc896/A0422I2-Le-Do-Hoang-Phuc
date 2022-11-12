package castudymodule2.services.lmpl;

import castudymodule2.models.Booking;
import castudymodule2.services.BookingService;
import castudymodule2.ultils.BookingComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServicelmpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());


    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
    }

    @Override
    public void displayList() {

    }
}
