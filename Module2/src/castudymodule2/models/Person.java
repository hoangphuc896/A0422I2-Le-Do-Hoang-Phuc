package castudymodule2.models;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements Serializable {
    static {
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    private String id;
    private String name;
    private Date birthday;
    private String sex;
    private String idCard;
    private String email;

    public Person() {
    }

    public Person(String id, String name, Date birthday, String sex, String idCard, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.idCard = idCard;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static DateFormat dateFormat;


    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", birthday=" + dateFormat.format(birthday) +
                        ", sex='" + sex + '\'' +
                        ", idCard='" + idCard + '\'' +
                        ", email='" + email + '\'' +
                        ", "
                ;
    }
}
