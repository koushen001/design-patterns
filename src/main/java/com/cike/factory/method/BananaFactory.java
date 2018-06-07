package com.cike.factory.method;

/**
 * 香蕉工厂
 *
 **/
public class BananaFactory implements FuritFactory{
    @Override
    public Furit create() {
        return new Banana();
    }
}
