package com.cike.proxy.statics;

/**
 * 接口实现
 *
 **/
public class UserDaoImpl implements UserDao{

    public void save() {
        System.out.println("保存用户");
    }
}
