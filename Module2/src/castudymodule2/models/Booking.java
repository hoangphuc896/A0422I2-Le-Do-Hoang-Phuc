package castudymodule2.models;

import java.util.Date;

public class Booking {
    private String idBooking;
    private Date starTime;
    private Date endTime;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(String idBooking, Date starTime, Date endTime, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.starTime = starTime;
        this.endTime = endTime;
        this.customer = customer;
        this.facility = facility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", starTime=" + starTime +
                ", endTime=" + endTime +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
