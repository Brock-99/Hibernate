package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author DanujaV
 * @created 17/11/2021 - 8:39 AM
 */
@Entity(name = "passport")
public class Passport {
    @Id
    private String PsID;
    private String issueDate;

    @OneToOne
    private Person person;

    public Passport() {
    }

    public Passport(String PsID, String issueDate, Person person) {
        this.PsID = PsID;
        this.issueDate = issueDate;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPsID() {
        return PsID;
    }

    public void setPsID(String PsID) {
        this.PsID = PsID;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "PsID='" + PsID + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", person=" + person +
                '}';
    }
}
