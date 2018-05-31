package com.cike.exterior;

/**
 * 外观对象
 *
 **/
public class Facaed {
    public static void test(){
        AModelApi a = new AModelImpl();
        a.testA();
        BModelApi b = new BModelImpl();
        b.testB();
        CModelApi c = new CModelImpl();
        c.testC();
    }
}
