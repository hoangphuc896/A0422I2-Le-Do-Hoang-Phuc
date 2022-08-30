package casestudymodule2.services;

import casestudymodule2.models.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override

    public void display() {
        for (Employee employee:employeeList){
            System.out.println(employee.toString());
        }
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
        System.out.println("Enter lever : ");
        String lever = scanner.nextLine();
        System.out.println("Enter position : ");
        String position = scanner.nextLine();
        System.out.println("Enter salary");
        int salary =  Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id , name , age , sex , idCard , email , lever , position , salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Change lever : ");
        String lever = scanner.nextLine();
        System.out.println("Change position");
        String position = scanner.nextLine();
        System.out.println("Change salary");
        int  salary = scanner.nextInt();
        Employee employee = new Employee(lever , position , salary);
        employeeList.set(id , employee);
    }

    @Override
    public void delete() {

    }
}

