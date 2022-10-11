package casestudymodule2.services;

import casestudymodule2.exception.UserException;
import casestudymodule2.models.Employee;
import casestudymodule2.ultils.ReadAndWrite;
import casestudymodule2.validate.Validator;

import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override

    public void display() {
        employeeList = (List<Employee>) ReadAndWrite.read("D:\\Codegym\\Module_2\\src\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name :");
        String name = scanner.nextLine();

        Date birthday ;
        do {
            System.out.println("Enter Birthday : ");
            String dateAsString = scanner.nextLine();
            try {
                birthday = Validator.ValidateBirthday(dateAsString);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }

        }while (true);
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
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, birthday, sex, idCard, email, lever, position, salary);
        employeeList.add(employee);
        ReadAndWrite.write(employeeList, "D:\\Codegym\\Module_2\\src\\data\\employee.csv");
    }

    @Override
    public void edit() {
        System.out.println("Enter find id");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getId() == id) {
                isExisted = true;
                System.out.println("Enter Change Name : ");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.println("Enter Change Birdth : ");
                employeeList.get(i).setBirthday(new Date(Date.parse(scanner.nextLine())));
                System.out.println("Enter Change Sex : ");
                employeeList.get(i).setSex(scanner.nextLine());
                System.out.println("Enter Change IdCard : ");
                employeeList.get(i).setIdCard(scanner.nextLine());
                System.out.println("Enter Change Email : ");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter Change Lever : ");
                employeeList.get(i).setLever(scanner.nextLine());
                System.out.println("Enter Change Position : ");
                employeeList.get(i).setPosition(scanner.nextLine());
                System.out.println("Enter Change Salary : ");
                employeeList.get(i).setSalary(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        if (!isExisted){
            System.out.printf("id = %d not existed.\n", id);
        }else {
            System.out.println(employeeList);
        }
    }

    @Override
    public void delete() {

    }
}

