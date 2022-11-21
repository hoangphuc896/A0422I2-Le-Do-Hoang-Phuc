package castudymodule2.services.lmpl;

import castudymodule2.models.Customer;
import castudymodule2.models.Employee;
import castudymodule2.services.CustomerService;
import castudymodule2.ultils.ReadAndWrite;
import castudymodule2.ultils.RegexPerson;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        String id = RegexPerson.inputId();
        String name = RegexPerson.inputName();
        Date birthDay = RegexPerson.inputBirthDay();
        String sex = RegexPerson.inputSex();
        String idCard = RegexPerson.inputIdCard();
        String email = RegexPerson.inputEmail();
        String type = RegexPerson.inputCustomerType();
        String adress = RegexPerson.inputAdress();
        Customer customer = new Customer(id, name, birthDay, sex, idCard, email, type, adress);
        customerList.add(customer);
        ReadAndWrite.write(customerList,"D:\\Codegym\\Module2\\src\\castudymodule2\\data\\customer.csv");
    }

    @Override
    public void edit() {
        System.out.println("Enter Find id ");
        String id = scanner.nextLine();
        boolean isExisted = false;
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                isExisted = true;
                System.out.println("Mời Bạn Nhập Lại Tên :");
                customer.setName(RegexPerson.inputName());
                System.out.println("Mời Bạn Nhập Lại Ngày Sinh :");
                customer.setBirthday(RegexPerson.inputBirthDay());
                System.out.println("Mời Bạn Nhập Lại Giới Tính :");
                customer.setSex(RegexPerson.inputSex());
                System.out.println("Mời Bạn Nhập Chứng Minh :");
                customer.setIdCard(RegexPerson.inputIdCard());
                System.out.println("Mời Bạn Nhập Lại Email :");
                customer.setEmail(RegexPerson.inputEmail());
                System.out.println("Mời Bạn Nhập Lại Loại Khách Hàng :");
                customer.setCustomerType(RegexPerson.inputCustomerType());
                System.out.println("Mời Bạn Nhập lại Địa Chỉ :");
                customer.setAddress(RegexPerson.inputAdress());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            System.out.println(customerList);
        }
    }

    @Override
    public void displayList() {
        customerList = (List<Customer>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\customer.csv");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}