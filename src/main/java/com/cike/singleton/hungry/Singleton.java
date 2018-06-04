package com.cike.singleton.hungry;

/**
 * 饿汉式单例实现
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        return singleton;
    }
}
