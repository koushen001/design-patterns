package com.cike.factory.simple;

/**
 * 客户端，使用Api接口，简单工厂模式
 *
 **/
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.operation();
    }
}
