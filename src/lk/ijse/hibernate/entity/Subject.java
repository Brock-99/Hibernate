package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DanujaV
 * @created 17/11/2021 - 10:57 AM
 */
@Entity(name = "subject")
public class Subject {
    @Id
    private String sId; //S001
    private String sName;   //java

    @ManyToMany(mappedBy = "subjectList")
    private List<Lecturer> lecturerList = new ArrayList<>();

    public Subject() {
    }

    public Subject(String sId, String sName, List<Lecturer> lecturerList) {
        this.sId = sId;
        this.sName = sName;
        this.lecturerList = lecturerList;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(List<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", lecturerList=" + lecturerList +
                '}';
    }
}
