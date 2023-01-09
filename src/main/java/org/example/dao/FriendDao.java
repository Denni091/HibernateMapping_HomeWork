package org.example.dao;

import org.example.entity.Friend;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FriendDao {

    public void save(Friend friend) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(friend);

        transaction.commit();
        session.close();
    }
}
