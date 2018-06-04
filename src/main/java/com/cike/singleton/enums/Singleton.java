package com.cike.singleton.enums;

/**
 * 枚举实现单例
 **/
public enum Singleton {
    /**
     * 定义了一个枚举的元素，它就代表了Singleton的一个实例
     */
    uniqueInstance;

    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOPeration(){
        //功能处理
        System.out.println("功能处理");
    }
}
