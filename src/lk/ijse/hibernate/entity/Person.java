package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author DanujaV
 * @created 17/11/2021 - 8:38 AM
 */
@Entity(name = "person")
public class Person {
    @Id
    private String PID;
    private String pName;

    public Person() {
    }

    public Person(String PID, String pName) {
        this.PID = PID;
        this.pName = pName;
    }



    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PID='" + PID + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
