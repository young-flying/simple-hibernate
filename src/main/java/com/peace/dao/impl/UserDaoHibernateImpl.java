package com.peace.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.peace.dao.HibernateUtil;
import com.peace.dao.UserDao;
import com.peace.domain.User;

public class UserDaoHibernateImpl implements UserDao {

    public void savaUser(User user) {
        // TODO Auto-generated method stub
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.save(user);
            tx.commit();
        } finally {
            if(s != null)
                s.close();
        }
    }

    public User findUserByName(String name) {
        // TODO Auto-generated method stub
        Session s = null;
        try {
            s = HibernateUtil.getSession();
            Criteria c = s.createCriteria(User.class);
            c.add(Restrictions.eq("name", name));
            User user = (User) c.uniqueResult();
            return user;
        } finally {
            if(s != null) {
                s.close();
            }
        }
    }

    public User findUserById(int id) {
        // TODO Auto-generated method stub
        Session s = null;
        try {
            s = HibernateUtil.getSession();
            User user = (User) s.get(User.class, id);
            return user;
        } finally {
            if(s != null) {
                s.close();
            }
        }
    }

    public void updateUser(User user) {
        // TODO Auto-generated method stub
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.update(user);
            tx.commit();
        } finally {
            if(s != null)
                s.close();
        }
    }

    public void remove(User user) {
        // TODO Auto-generated method stub
        Session s = null;
        Transaction tx = null;
        try {
            s = HibernateUtil.getSession();
            tx = s.beginTransaction();
            s.delete(user);
            tx.commit();
        } finally {
            if(s != null)
                s.close();
        }
    }

}