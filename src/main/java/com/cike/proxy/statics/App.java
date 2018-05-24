package com.cike.proxy.statics;

/**
 * 测试类
 *
 * @author kouliang
 * @create 2018-05-24 17:34
 **/
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDaoImpl();
        //代理对象,把目标对象传给代理对象，建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        //执行代理的方法
        proxy.save();
    }
}
