package com.example.students.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "classname")
public class ClassName {
    @Id
    @Pattern(regexp = "[A-Z]-[0-9]")
    @Column(columnDefinition = "varchar(20)")
    private String idClass;
    private String className;
    @OneToMany(mappedBy = "classname",cascade = CascadeType.ALL)
    private List<Student> student;

    public ClassName() {
    }

    public ClassName(String idClass, String className, List<Student> student) {
        this.idClass = idClass;
        this.className = className;
        this.student = student;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}

