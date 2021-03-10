package com.itheima.jdk;

public class JdkTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao)jdkProxy.CreatProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
