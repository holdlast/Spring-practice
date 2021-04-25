package com.itheima.cglib;

public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao) cglibProxy.creatProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();

    }
}
