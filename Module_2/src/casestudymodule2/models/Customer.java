package casestudymodule2.models;

import java.io.Serializable;
import java.util.Date;

public class Customer extends Person {
    private String typeCustomer ;
    private String address ;

    public Customer(){

    }
    public Customer(int id, String name, Date birthday, String sex, String idCard, String email, String typeCustomer , String address){
        super(id, name, birthday, sex, idCard, email);
        this.typeCustomer = typeCustomer ;
        this.address = address;
    }


    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
}
