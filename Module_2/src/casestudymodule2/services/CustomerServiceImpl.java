package casestudymodule2.services;

import casestudymodule2.exception.UserException;
import casestudymodule2.models.Customer;
import casestudymodule2.ultils.ReadAndWrite;
import casestudymodule2.validate.Validator;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final long serialVersionUID = 2906642554793891381L;

    @Override
    public void display() {
        customers = (List<Customer>) ReadAndWrite.read("D:\\Codegym\\Module_2\\src\\data\\customer.csv");
        for (Customer customer : customers) {
            System.out.println(customers.toString());
        }
    }


    @Override
    public void addNew() {

        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name :");
        String name = scanner.nextLine();

        Date birthday;
        do {
            System.out.println("Enter Birthday : ");
            String DateAsString = scanner.nextLine();
            try {
                birthday = Validator.ValidateBirthday(DateAsString);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        System.out.println("Enter sex :  ");
        String sex = scanner.nextLine();
        System.out.println("Enter idCard : ");
        String idCard = scanner.nextLine();
        System.out.println("Enter email : ");
        String email = scanner.nextLine();
        System.out.println("Enter TypeCustomer : ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, birthday, sex, idCard, email, typeCustomer, address);
        customers.add(customer);
        ReadAndWrite.write(customers, "D:\\Codegym\\Module_2\\src\\data\\customer.csv");
    }

    @Override
    public void edit() {
        System.out.println("Enter find id");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        int size = customers.size();
        for (int i = 0; i < size; i++) {
            if (customers.get(i).getId() == id) {
                isExisted = true;
                System.out.println("Enter Change Name : ");
                customers.get(i).setName(scanner.nextLine());
                System.out.println("Enter Change birthday : ");
                customers.get(i).getBirthday(new Date(Date.parse(scanner.nextLine())));
                System.out.println("Enter Change Sex  ");
                customers.get(i).setSex(scanner.nextLine());
                System.out.println("Enter Change IdCard : ");
                customers.get(i).setIdCard(scanner.nextLine());
                System.out.println("Enter Change Email : ");
                customers.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter Change TypeCustomer : ");
                customers.get(i).setTypeCustomer(scanner.nextLine());
                System.out.println("Enter Change Address : ");
                customers.get(i).setAddress(scanner.nextLine());

                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            System.out.println(customers);
        }
    }

    @Override
    public void delete() {

    }
}


//    @Override
//    public void delete(int id) {
//        Student student = null;
//        int size = studentList.size();
//        for (int i = 0; i < size; i++) {
//            if (studentList.get(i).getId() == id) {
//                student = studentList.get(i);
//                break;
//            }
//        }
//        if (student != null) {
//            studentList.remove(student);
//            studentDao.write(studentList);
//        } else {
//            System.out.printf("id = %d not existed.\n", id);
//        }
//    }
//}
