package casestudymodule2.services;

import casestudymodule2.models.Customer;
import casestudymodule2.models.Employee;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println(customers.toString());
    }

    @Override
    public void addNew() {
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        System.out.println("Enter age : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter sex :  ");
        String sex = scanner.nextLine();
        System.out.println("Enter idCard : ");
        String idCard = scanner.nextLine();
        System.out.println("Enter email : ");
        String email = scanner.nextLine();
        System.out.println("Enter TypeCustomer : ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter address : ");
        String address  = scanner.nextLine();
        Customer customer = new Customer(id , name , age , sex , idCard , email , typeCustomer , address);
        customers.add(customer);
    }

    @Override
    public void edit() {
    
    }

    @Override
    public void delete() {

    }
}
