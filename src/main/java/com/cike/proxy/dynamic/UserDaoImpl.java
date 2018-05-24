package com.cike.proxy.dynamic;

/**
 * 接口实现
 *
 * @author kouliang
 * @create 2018-05-24 17:30
 **/
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("保存用户");
    }
}
