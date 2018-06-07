package com.cike.factory.method;

/**
 * 苹果工厂
 *
 **/
public class AppleFactory implements FuritFactory{
    @Override
    public Furit create() {
        return new Apple();
    }
}
