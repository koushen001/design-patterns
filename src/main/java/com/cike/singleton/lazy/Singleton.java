package com.cike.singleton.lazy;

/**
 * 懒汉式单例实现
 **/
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {

    }

    public synchronized static Singleton getInstance(){
        if (singleton == null){
            singleton =  new Singleton();
        }
        return singleton;
    }
}
