package com.cike.adapter;

/**
 * 已经存在的接口，这个接口需要被适配
 **/
public class Adaptee {
    /**
     * 存在的方法
     */
    void specificRequest(){
        System.out.println("specificRequest");
    }
}
