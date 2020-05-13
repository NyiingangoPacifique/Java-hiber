/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import Reportview.Singups;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pacifique
 */
public class Signupcon {
    private Session session;
    public void saveBook(Singups b){
    Session session=ConnectHibernateUtil.getSessionFactory().openSession();
    Transaction tr=session.beginTransaction();
    session.save(b);
    tr.commit();
    session.close();
    }
}
