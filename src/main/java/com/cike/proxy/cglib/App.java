package com.cike.proxy.cglib;

import java.lang.annotation.Target;

/**
 * 测试类
 *
 * @author kouliang
 * @create 2018-05-24 22:33
 **/
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        //代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
