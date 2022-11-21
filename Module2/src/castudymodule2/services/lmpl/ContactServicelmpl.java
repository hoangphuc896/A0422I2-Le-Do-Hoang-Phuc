package castudymodule2.services.lmpl;

import castudymodule2.models.Booking;
import castudymodule2.models.Contract;
import castudymodule2.models.Customer;
import castudymodule2.services.ContactService;
import castudymodule2.ultils.ReadAndWrite;

import java.util.*;

public class ContactServicelmpl implements ContactService {
    private static Scanner scanner = new Scanner(System.in);
    public List<Contract> contracts = new ArrayList<>();

    public void addNewContact() {
        Queue<Booking> bookingQueue = new LinkedList<Booking>();
        Set<Booking> bookingSet = new BookingServicelmpl().sendBooking();
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
            ReadAndWrite.write(contracts,"D:\\Codegym\\Module2\\src\\castudymodule2\\data\\contract.csv");
            System.out.println("Đã tạo hợp đồng thành công");
        }
    }

    public void editContact() {
        System.out.println("Enter find id :");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        for (Contract contract : contracts) {
            if (contract.getId() == id) {
                isExisted = true;
                System.out.println("Enter change booking : ");
                contract.getBooking().setIdBooking(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter change pre : ");
                contract.setPre((scanner.nextLine()));
                System.out.println("Enter change pay : ");
                contract.setPay(scanner.nextLine());
                System.out.println("Enter change customer : ");
                contract.getCustomer().setId(scanner.nextLine());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            System.out.println(contracts);
        }
    }

    @Override
    public void displayList() {
        contracts = (List<Contract>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\contract.csv");
        for (Contract contract : contracts) {
            System.out.println(contract.toString());
        }
    }
}
