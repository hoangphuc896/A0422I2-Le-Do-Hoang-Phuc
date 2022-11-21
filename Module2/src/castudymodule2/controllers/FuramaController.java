package castudymodule2.controllers;

import castudymodule2.services.lmpl.*;
import castudymodule2.ultils.AgeException;

import java.io.Serializable;
import java.util.Scanner;

public class FuramaController implements Serializable {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Choose from 1-6");
            Scanner scanner = new Scanner(System.in);


            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    break;
                case 6:
                    check = false;
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("Choose from 1-4");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.displayList();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }

    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Customer");
            System.out.println("2. Add new Customer");
            System.out.println("3. Edit Customer");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.displayList();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.edit();
                    break;
                }
                case 4:
                    return;

            }
            scanner.nextLine();
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list Facility");
            System.out.println("2. Add new Facility");
            System.out.println("3. Display list Facility maintenance :");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.displayList();
                    break;
                }
                case 2: {
                    displayNewMenu();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    return;
                }
            }
            scanner.nextLine();
        }
    }

    public static void displayNewMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void displayBookingMenu() {
        BookingServicelmpl bookingService = new BookingServicelmpl();
        ContactServicelmpl contactService = new ContactServicelmpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add new Booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new Contracts");
            System.out.println("4. Display list Contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    bookingService.addBooking();
                    break;
                case 2:
                    bookingService.displayList();
                    break;
                case 3:
                    contactService.addNewContact();
                    break;
                case 4:
                    contactService.displayList();
                    break;
                case 5:
                    contactService.editContact();
                    break;
                case 6:
                    return;
            }
            scanner.nextLine();
        }
    }
}