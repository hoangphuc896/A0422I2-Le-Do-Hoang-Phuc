package com.example.student.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @Pattern(regexp = "SV-[0-9]")
    @Column(columnDefinition = "varchar(20)")
    private String id;
    @Size(min = 5,max = 40)
    private String studentName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;
    @Min(18)
    private int age;

    private String sex;
    @ManyToOne
    @JoinColumn(name = "id_class", nullable = false)
    private ClassName classname;

    public Student() {
    }

    public Student(String id, String studentName, LocalDate birthDay, int age, String sex, ClassName classname) {
        this.id = id;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.age = age;
        this.sex = sex;
        this.classname = classname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ClassName getClassname() {
        return classname;
    }

    public void setClassname(ClassName classname) {
        this.classname = classname;
    }
}
