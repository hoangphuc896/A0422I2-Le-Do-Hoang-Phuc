package ss19stringandregex.schoolclass.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Person {
    private String position;

    public Teacher() {
    }

    public Teacher(int id, String name, Date birthDay, String position) {
        super(id, name, birthDay);
        this.position = position;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "position='" + position + '\'' +
                "} ";
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s", getId(), getName(), dateFormat.format(getBirthDay()), getPosition());
    }
}
