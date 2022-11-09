package castudymodule2.models;

public class Contract {
    private int id;
    private Booking booking;
    private String pre;
    private String pay;
    private Customer customer;

    public Contract() {
    }

    public Contract(int id, Booking booking, String pre, String pay, Customer customer) {
        this.id = id;
        this.booking = booking;
        this.pre = pre;
        this.pay = pay;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", booking=" + booking +
                ", pre='" + pre + '\'' +
                ", pay='" + pay + '\'' +
                ", customer=" + customer +
                '}';
    }
}
