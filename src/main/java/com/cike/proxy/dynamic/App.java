package com.cike.proxy.dynamic;

/**
 * 测试类，动态代理
 *
 **/
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDaoImpl();
        //原始类型
        System.out.println(target.getClass());
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        //内存中动态生成的代理对象
        System.out.println(proxy);
        proxy.save();
    }
}
