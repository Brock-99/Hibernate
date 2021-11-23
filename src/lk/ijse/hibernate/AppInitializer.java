package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Currency;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setId("C002");
        c.setName("Danu");
        c.setAddress("Panadura");
        c.setSalary(25000);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(c);

        transaction.commit();

        session.close();
    }
}
