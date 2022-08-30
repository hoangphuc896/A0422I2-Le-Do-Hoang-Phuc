package casestudymodule2.models;

public class Employee extends Person {
    private String lever;
    private String position;
    private int salary;

    public Employee() {

    }

    public Employee(int id, String name, int age, String sex, String idCard, String email, String lever, String position, int salary) {
        super(id, name, age, sex, idCard, email);
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String lever, String position, int salary) {
        this.lever = lever;
        this.position = position;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Employee{" +
                        super.toString()+
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
