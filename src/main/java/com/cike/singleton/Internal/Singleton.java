package com.cike.singleton.Internal;

/**
 * 内部类单例实现
 **/
public class Singleton {

    private Singleton() {
    }

    /**
     * 没有绑定关系，而且只有被调用时才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton singleton = new Singleton();
    }

    public synchronized static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
