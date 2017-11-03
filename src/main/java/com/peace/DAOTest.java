package com.peace;

import java.util.Date;

import com.peace.dao.UserDao;
import com.peace.dao.impl.UserDaoHibernateImpl;
import com.peace.domain.User;

public class DAOTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserDao dao = new UserDaoHibernateImpl();
        User user = new User();
        user.setName("ABC");
        user.setBirthday(new Date());
        dao.savaUser(user);

        user.setName("DEF");
        dao.updateUser(user);

        User u1 = dao.findUserById(user.getId());
        System.out.println(u1);

        User u2 = dao.findUserByName("DEF");
        System.out.println(u2);

        dao.remove(user);
    }

}