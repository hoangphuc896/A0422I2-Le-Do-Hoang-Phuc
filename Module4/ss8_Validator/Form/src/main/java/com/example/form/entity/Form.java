package com.example.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "form")
public class Form {
    @Id
    @Pattern(regexp = "SV-[0-9]{3}")
    @Column(columnDefinition = "varchar(20)")
    private String id;
    @Size(min = 5, max = 45)
    private String firstName;
    @Pattern(regexp = "0905[0-9]{5}")
    private String phones;
    @Min(value = 18 , message = "{create.age}")
    private int age;
    @Email
    private String email;

    public Form() {
    }

    public Form(String id, String firstName, String phones, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.phones = phones;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}