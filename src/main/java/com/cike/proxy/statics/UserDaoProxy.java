package com.cike.proxy.statics;

/**
 * 代理对象，静态代理
 *
 **/
public class UserDaoProxy implements UserDao{
    //接收保存目标对象
    private UserDao target;

    public UserDaoProxy(UserDao target){
        this.target = target;
    }

    public void save() {
        System.out.println("开始事物");
        this.target.save();
        System.out.println("提交事务");
    }
}
