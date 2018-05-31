package com.cike.factory.simple;

/**
 * 工厂类，用来创建Api对象
 *
 **/
public class Factory {
    /**
     * 创建具体Api对象的方法
     * @return
     */
    public static Api createApi(){
        return new ImplA();
    }
}
