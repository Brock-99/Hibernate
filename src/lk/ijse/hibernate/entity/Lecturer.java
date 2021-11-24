package lk.ijse.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DanujaV
 * @created 17/11/2021 - 10:56 AM
 */
@Entity(name = "lecturer")
public class Lecturer {
    @Id
    private String lId; //L001
    @Column(name = "lName")
    private String name; //Saman

    @ManyToMany
    private List<Subject> subjectList = new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(String lId, String name, List<Subject> subjectList) {
        this.lId = lId;
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
