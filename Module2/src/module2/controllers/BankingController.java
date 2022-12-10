package module2.controllers;

import module2.services.Imlp.AccountServicesImpl;
import module2.services.Imlp.PayAccountServicesImpl;

import java.util.Scanner;

public class BankingController {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("1.Tài Khoản Tiết Kiệm");
            System.out.println("2.Tài Khoản Thanh Toán");
            System.out.println("3.Thoát");
            System.out.println("Chọn từ 1-3");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    displayAccount();
                    break;
                case 2:
                    displayPayAccount();
                    break;
                case 3:
                    check = false;
            }
        }
    }

    public static void displayAccount() {
        AccountServicesImpl accountServices = new AccountServicesImpl();
        boolean check = true;
        while (check) {

            System.out.println("1. Add new Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Display Account");
            System.out.println("4. Search Account");
            System.out.println("5. Return main menu");
            System.out.println("Choose from 1-5");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    accountServices.addNew();
                    break;
                case 2:
                    accountServices.delete();
                    break;
                case 3:
                    accountServices.display();
                    break;
                case 4:
                    accountServices.search();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void displayPayAccount() {
        PayAccountServicesImpl payAccountServices = new PayAccountServicesImpl();
        boolean check = true;
        while (check) {

            System.out.println("1. Add new Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Display Account");
            System.out.println("4. Search Account");
            System.out.println("5. Return main menu");
            System.out.println("Choose from 1-5");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    payAccountServices.addNew();
                    break;
                case 2:
                    payAccountServices.delete();
                    break;
                case 3:
                    payAccountServices.display();
                    break;
                case 4:
                    payAccountServices.search();
                    break;
                case 5:
                    return;
            }
        }
    }
}
