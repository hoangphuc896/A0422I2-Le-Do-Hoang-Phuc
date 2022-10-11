package casestudymodule2.services;

import casestudymodule2.models.Booking;
import casestudymodule2.models.Contract;
import casestudymodule2.models.Customer;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contracts = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Đang tạo hợp đồng cho Booking có thông tin : " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin : " + customer.toString());
            System.out.println("nhập id hợp đồng:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập số tiền trả trước:");
            String pre = scanner.nextLine();
            System.out.println("nhập số chi phí :");
            String pay = scanner.nextLine();
            Contract contract = new Contract(id, booking, pre, pay, customer);
            contracts.add(contract);
            System.out.println("Đã tạo hợp đồng thành công");

        }
    }   

    @Override
    public void displayListContract() {
        for (Contract contract : contracts) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {
        System.out.println("Enter find id :");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        int size = contracts.size();
        for (int i = 0; i < size; i++) {
            if (contracts.get(i).getId() == id) {
                isExisted = true;
                System.out.println("Enter change booking : ");
                contracts.get(i).getBooking().setIdBooking(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter change pre : ");
                contracts.get(i).setPre((scanner.nextLine()));
                System.out.println("Enter change pay : ");
                contracts.get(i).setPay(scanner.nextLine());
                System.out.println("Enter change customer : ");
                contracts.get(i).getCustomer().setId(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            System.out.println(contracts);
        }
    }
}
