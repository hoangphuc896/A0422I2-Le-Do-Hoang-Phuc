package ss19stringandregex.schoolclass.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private int id;
    private String name;
    private Date birthDay;

    public Person() {
    }

    public Person(int id, String name, Date birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public abstract String getInfo();

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + dateFormat.format(birthDay)+", ";
    }
}
