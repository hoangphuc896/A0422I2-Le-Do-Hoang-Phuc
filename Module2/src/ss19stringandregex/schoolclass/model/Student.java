package ss19stringandregex.schoolclass.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {
    private String classification;

    public Student() {
    }

    public Student(int id, String name, Date birthDay, String classification) {
        super(id, name, birthDay);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "classification='" + classification + '\'' +
                "} ";
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s", getId(), getName(), dateFormat.format(getBirthDay()), getClassification());
    }
}
