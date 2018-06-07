package com.cike.factory.method;

/**
 * 客户端，工厂方法模式
 *
 **/
public class Client {
    public static void main(String[] args) {
        FuritFactory appleFactory = new AppleFactory();
        appleFactory.create().get();
        FuritFactory bananaFactory = new BananaFactory();
        bananaFactory.create().get();
    }
}
