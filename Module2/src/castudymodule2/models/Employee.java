package castudymodule2.models;

import java.io.Serializable;
import java.util.Date;

public class Employee extends Person implements Serializable {
    private String lever;
    private String position;
    private String salary;

    public Employee(){

    }

    @Override
    public String getInfo() {
        return null;
    }

    public Employee(String id, String name, Date birthday, String sex, String idCard, String email, String lever ,String position ,String salary) {
        super(id, name, birthday, sex, idCard, email);
        this.lever = lever ;
        this.position = position ;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
