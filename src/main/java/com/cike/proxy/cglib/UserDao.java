package com.cike.proxy.cglib;

/**
 * 目标对象，没有实现任何接口
 *
 * @author kouliang
 * @create 2018-05-24 22:26
 **/
public class UserDao {

    public void save(){
        System.out.println("保存数据");
    }
}
