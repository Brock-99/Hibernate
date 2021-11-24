package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DanujaV
 * @created 03/11/2021 - 9:46 AM
 */
public class AppInitializer {
    public static void main(String[] args) {
        /*Owner owner = new Owner();
        owner.setoId("O001");
        owner.setoName("Danuja");

        Pet p1 = new Pet();
        p1.setpId("P001");
        p1.setpName("Dog");
        p1.setOwner(owner);

        Pet p2 = new Pet();
        p2.setpId("P002");
        p2.setpName("Cat");
        p2.setOwner(owner);

        owner.getPetList().add(p1);
        owner.getPetList().add(p2);*/

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Owner owner = session.get(Owner.class, "O001");

        System.out.println(owner.getoId());
        System.out.println(owner.getoName());
        //
        System.out.println(owner.getPetList());

        transaction.commit();
        session.close();

    }
}
