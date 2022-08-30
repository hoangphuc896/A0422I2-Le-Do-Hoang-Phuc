package casestudymodule2.services;

import casestudymodule2.models.Facility;
import casestudymodule2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    private static Map<Facility , Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {

    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter id :");
        String idFacility = scanner.nextLine();
        System.out.println("Enter name :");
        String nameService = scanner.nextLine();
        System.out.println("Enter age : ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter sex :  ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter idCard : ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email : ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter TypeCustomer : ");
        String standardVilla = scanner.nextLine();
        System.out.println("Enter address : ");
        double areaPool  = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter floor :");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa();
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
