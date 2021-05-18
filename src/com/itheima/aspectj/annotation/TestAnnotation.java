package com.itheima.aspectj.annotation;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        String xmlPath="com/itheima/aspectj/annotation/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        userDao.addUser();
    }
}
