package castudymodule2.services.lmpl;

import castudymodule2.models.Employee;
import castudymodule2.services.EmployeeService;
import castudymodule2.ultils.AgeException;
import castudymodule2.ultils.ReadAndWrite;
import castudymodule2.ultils.RegexPerson;
import castudymodule2.validate.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        String id = RegexPerson.inputId();
        String name = RegexPerson.inputName();
        Date birthDay = RegexPerson.inputBirthDay();
        String sex = RegexPerson.inputSex();
        String idCard = RegexPerson.inputIdCard();
        String email = RegexPerson.inputEmail();
        String lever = RegexPerson.inputLever();
        String position = RegexPerson.inputPosition();
        String salary = RegexPerson.inputSalary();

        Employee employee = new Employee(id, name, birthDay, sex, idCard, email, lever, position, salary);
        employeeList.add(employee);
        ReadAndWrite.write(employeeList,"D:\\Codegym\\Module2\\src\\castudymodule2\\data\\employee.csv");
    }


    @Override
    public void edit() {
        System.out.println("Enter Find id ");
        String id = scanner.nextLine();
        boolean isExisted = false;
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                isExisted = true;
                employee.setName(RegexPerson.inputName());
                employee.setBirthday(RegexPerson.inputBirthDay());
                employee.setSex(RegexPerson.inputSex());
                employee.setIdCard(RegexPerson.inputIdCard());
                employee.setEmail(RegexPerson.inputEmail());
                employee.setLever(RegexPerson.inputLever());
                employee.setPosition(RegexPerson.inputPosition());
                employee.setSalary(RegexPerson.inputSalary());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            System.out.println(employeeList);
        }
    }

    @Override
    public void displayList() {
        employeeList = (List<Employee>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }


}
