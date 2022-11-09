package castudymodule2.models;

import java.util.Date;

public class Customer extends Person{
    private String customerType;
    private String address ;


    public Customer(String id, String name, Date birthday, String sex, String idCard, String email , String customerType , String address) {
        super(id, name, birthday, sex, idCard, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()  +
                 "customerType='" + customerType + '\'' +
                 ", address='" + address + '\'' +
                "} ";
    }
}
