package com.peace.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public final class HibernateUtil {
    private static SessionFactory sessionFactory = null;
    private HibernateUtil() {
        // TODO Auto-generated constructor stub
    }
    static {
        Configuration cfg = new Configuration();
        cfg.configure();
        ServiceRegistry registy = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        sessionFactory = cfg.buildSessionFactory(registy);
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session getSession() {
        return sessionFactory.openSession();        
    }
}