package castudymodule2.models;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    private String roomStandard;
    private int floors;

    public House() {

    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String roomStandard, int floors) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                "} ";
    }
}
