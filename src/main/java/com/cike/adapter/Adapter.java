package com.cike.adapter;

/**
 * 适配器
 *
 **/
public class Adapter implements Target{

    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;


    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //调用已经存在的方法，进行适配
        this.adaptee.specificRequest();
    }
}
