/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import Reportview.Checkout;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pacifique
 */
public class checkoutcon {
     private Session session;
    public void saveCheckout(Checkout b){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.save(b);
    tr.commit();
    session.close();
    }
    public void updateCheckout(Checkout b){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.update(b);
    tr.commit();
    session.close();
    }
    public List<Checkout>listAll(){
        List<Checkout> cli=null;
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from Checkout");
    
    return q.list();
    }
}
