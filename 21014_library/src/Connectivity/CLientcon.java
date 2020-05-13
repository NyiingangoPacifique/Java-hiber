/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import Reportview.Client;
import static java.util.Collections.list;
import java.util.List;
import java.util.LinkedList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pacifique
 */
public class CLientcon {
     private Session session;
    
    public void saveClient(Client c){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.save(c);
    tr.commit();
    session.close();
    }
    public void updateClient(Client c){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.update(c);
    tr.commit();
    session.close();
    }
    public void deleteClient(Client c){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.delete(c);
    tr.commit();
    session.close();
    }
    public List<Client>listAll(){
        List<Client> cli=null;
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from Client");
    
    return q.list();
    }
}
