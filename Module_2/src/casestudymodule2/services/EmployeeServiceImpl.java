package casestudymodule2.services;

import java.util.Date;

public class EmployeeServiceImpl<E> {
    private int codingStaff ;
    private String name , sex ;
    private Date date ;
    private double prove;
    private int phone ;
    private String email ;
    private int education ;
    private String title ;
    private int wage ;

    public EmployeeServiceImpl(int codingStaff, String name, String sex, Date date, double prove, int phone, String email, int education, String title, int wage) {
        this.codingStaff = codingStaff;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.prove = prove;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.title = title;
        this.wage = wage;
    }

}

