package com.cike.factory.simple;

/**
 * 水果工厂
 *
 **/
public class FuritFactory {
    /**
     * 创建水果对象
     */
    public static Furit create(String type){
        if (type.equals("apple")){
            return new Apple();
        }
        if (type.equals("banana")){
            return new Banana();
        }
        throw new RuntimeException();
    }
}
