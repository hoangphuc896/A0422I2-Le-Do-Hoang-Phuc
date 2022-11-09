package casestudymodule2.services;

import casestudymodule2.models.*;
import casestudymodule2.ultils.RegexData;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA  = "^([3-9]\\d[1-9]\\d{2,})$";


    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Map<String, Facility> listFacilityMaintain = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "number of times rented : " + element.getValue());
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintain() {
        System.out.println("Danh sach cac dinh vu dang duoc bao tri");
        for (Map.Entry<String, Facility> entry : listFacilityMaintain.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        String idFacility  = inputId();
        System.out.println("Enter nameService :");
        String nameService = scanner.nextLine();

        System.out.println("Enter areaUse : ");
        double areaUse;
        try {
            areaUse = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập sai định dạng :");
            areaUse = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Enter rentalPrice :  ");
        int rentalPrice;
        try {
            rentalPrice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPrice = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter rentalPeopleMax : ");
        int rentalPeopleMax;
        try {
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Enter styleRental : ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter standardVilla : ");
        String standardVilla = scanner.nextLine();
        System.out.println("Enter areaPool : ");
        double areaPool;
        try {
            areaPool = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            areaPool = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Enter floor :");
        int floor;
        try {
            floor = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            floor = Integer.parseInt(scanner.nextLine());
        }
        Villa villa = new Villa(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Enter New villa");
    }

    private String inputId(){
        System.out.println("nhập id, mã dịch vụ :");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_VILLA,"bạn đã nhập sai mã định dạnh");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter idFacility :");
        String idFacility = scanner.nextLine();
        System.out.println("Enter nameService :");
        String nameService = scanner.nextLine();
        System.out.println("Enter areaUse : ");
        double areaUse;
        try {
            areaUse = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            areaUse = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Enter rentalPrice :  ");
        int rentalPrice ;
        try {
            rentalPrice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPrice = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter rentalPeopleMax : ");
        int rentalPeopleMax ;
        try {
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter styleRental : ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter standardHouse : ");
        String standardHouse = scanner.nextLine();
        System.out.println("Enter floor :");
        int floor ;
        try {
            floor = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            floor = Integer.parseInt(scanner.nextLine());
        }
        House house = new House(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardHouse, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Enter New House");
    }


    @Override
    public void addNewRoom() {
        System.out.println("Enter idFacility :");
        String idFacility = scanner.nextLine();
        System.out.println("Enter nameService :");
        String nameService = scanner.nextLine();
        System.out.println("Enter areaUse : ");
        double areaUse ;
        try {
            areaUse = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            areaUse = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Enter rentalPrice :  ");
        int rentalPrice ;
        try {
            rentalPrice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPrice = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter rentalPeopleMax : ");
        int rentalPeopleMax ;
        try {
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai định dạng , mời bạn nhập lại :");
            rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter styleRental : ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter freeService : ");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Enter New Room");
    }
}
