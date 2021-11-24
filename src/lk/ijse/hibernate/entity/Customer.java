package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;

import javax.persistence.*;

/**
 * @author DanujaV
 * @created 03/11/2021 - 9:50 AM
 */
//@Entity
@Entity(name = "customer_detail")
public class Customer {
    @Id
    String id;
   @Column(name = "cust_name")
           @Embedded
   Name name;    // fName = danuja mName = vimukthi lname = deshan
    String address;
    @Transient
    double salary;

    public Customer() {
    }

    public Customer(String id, Name name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
