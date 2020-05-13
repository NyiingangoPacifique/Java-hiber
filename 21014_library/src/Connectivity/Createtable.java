/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import Reportview.Boocategory;
import Reportview.Book;
import Reportview.Checkin;
import Reportview.Checkout;
import Reportview.Client;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author pacifique
 */
public class Createtable {
    public static void main(String[] args){
    AnnotationConfiguration config =new AnnotationConfiguration();
    config.addAnnotatedClass(Client.class);
    config.addAnnotatedClass(Book.class);
    config.addAnnotatedClass(Boocategory.class);
    config.addAnnotatedClass(Checkin.class);
    config.addAnnotatedClass(Checkout.class);
    config.configure("hibernate.cfg.xml");
    //config.addAnnotatedClass(Client.class);
    new SchemaExport(config).create(true, true);
    
    }
}
