package com.itheima.jdk;
import com.itheima.aspect.MyAspect;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//实现InvocationHandler接口
public class JdkProxy {
    private UserDao userDao;
    public Object CreatProxy(UserDao userDao){
        this.userDao = userDao;
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
        Class[] clazz = userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,clazz,this::invoke);
    }
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        MyAspect myAspect = new MyAspect();
        myAspect.check_Permissions();
        Object obj = method.invoke(userDao,args);
        myAspect.log();
        return obj;
    }
}
