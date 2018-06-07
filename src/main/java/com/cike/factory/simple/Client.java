package com.cike.factory.simple;

/**
 * 客户端，简单工厂模式
 *
 **/
public class Client {
    public static void main(String[] args) {
        FuritFactory.create("apple").get();
        FuritFactory.create("banana").get();
    }
}
