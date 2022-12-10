package module2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ManageBank {
    private int id;
    private String coding;
    private String name;
    private Date createdate;

    public ManageBank() {
    }

    public ManageBank(int id, String coding, String name, Date createdate) {
        this.id = id;
        this.coding = coding;
        this.name = name;
        this.createdate = createdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public abstract String getInfo();

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", coding='" + coding + '\'' +
                        ", name='" + name + '\'' +
                        ", createdate=" + dateFormat.format(createdate) +
                        ", ";
    }
}
