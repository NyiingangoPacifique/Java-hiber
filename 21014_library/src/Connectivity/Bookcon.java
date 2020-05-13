/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import Reportview.Book;
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
public class Bookcon {
      private Session session;
    public void saveBook(Book b){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.save(b);
    tr.commit();
    session.close();
    }
    public void updateBook(Book b){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.update(b);
    tr.commit();
    session.close();
    }
    public List<Book>listAll(){
        List<Book> cli=null;
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tx=ss.beginTransaction();
    Query q=ss.createQuery("from Book");
    
    return q.list();
    }
}
