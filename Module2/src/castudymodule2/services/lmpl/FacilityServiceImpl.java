package castudymodule2.services.lmpl;

import castudymodule2.models.Facility;
import castudymodule2.models.House;
import castudymodule2.models.Room;
import castudymodule2.models.Villa;
import castudymodule2.services.FacilityService;
import castudymodule2.ultils.ReadAndWrite;
import castudymodule2.ultils.RegexFacility;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Map<Facility, String> listFacilityMaintain = new HashMap<>();

    @Override
    public void displayMaintenance() {
        listFacilityMaintain = (Map<Facility, String>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitilymaintain.csv");
        if (listFacilityMaintain != null) {
            System.out.println("Danh Sach duoc bao tri");
            for (Map.Entry<Facility, String> entry : listFacilityMaintain.entrySet()) {
                System.out.println(entry.getKey().toString());
            }
        }
    }

    @Override
    public void displayList() {
        facilityIntegerMap = (Map<Facility, Integer>) ReadAndWrite.read("D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitily.csv");
        if (facilityIntegerMap != null) {
            System.out.println("Danh Sách đã Đặt");
            for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
                System.out.println("Service" + facility.getKey() + "number of times rented : " + facility.getValue());
            }
        }
    }

    @Override
    public void addNewVilla() {
        String idVilla = RegexFacility.IdVilla();
        String nameVilla = RegexFacility.NameService();
        double areaUse = RegexFacility.areaService();
        int rentalPrice = RegexFacility.rentalPrice();
        int rentalPeopleMax = RegexFacility.rentalPeopleMax();
        String styleRental = RegexFacility.styleRental();
        String roomStandard = RegexFacility.roomStandard();
        double areaPool = RegexFacility.areaPool();
        int floors = RegexFacility.floors();
        Villa villa = new Villa(idVilla, nameVilla, areaUse, rentalPrice, rentalPeopleMax, styleRental, roomStandard, areaPool, floors);
        facilityIntegerMap.put(villa, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitily.csv");
    }

    @Override
    public void addNewHouse() {
        String idHouse = RegexFacility.IdHouse();
        String nameHouse = RegexFacility.NameService();
        double areaUse = RegexFacility.areaService();
        int rentalPrice = RegexFacility.rentalPrice();
        int rentalPeopleMax = RegexFacility.rentalPeopleMax();
        String styleRental = RegexFacility.styleRental();
        String roomStandard = RegexFacility.roomStandard();
        int floor = RegexFacility.floors();
        House house = new House(idHouse, nameHouse, areaUse, rentalPrice, rentalPeopleMax, styleRental, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitily.csv");
    }

    @Override
    public void addNewRoom() {
        String idRoom = RegexFacility.IdRoom();
        String nameHouse = RegexFacility.NameService();
        double areaUse = RegexFacility.areaService();
        int rentalPrice = RegexFacility.rentalPrice();
        int rentalPeopleMax = RegexFacility.rentalPeopleMax();
        String styleRental = RegexFacility.styleRental();
        String freeService = RegexFacility.freeService();
        Room room = new Room(idRoom, nameHouse, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        facilityIntegerMap.put(room, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "D:\\Codegym\\Module2\\src\\castudymodule2\\data\\facitily.csv");
    }


}
