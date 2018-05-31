package com.xp.proxy.javassistProxy;


import com.xp.proxy.common.IDBQuery;
import com.xp.proxy.staticProxy.DBQuery;
import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

/**
 * Created by xiaop on 2018/5/31.
 */
public class JavassistDynDbQueryHandler implements MethodHandler {
    IDBQuery real = null;

    @Override
    public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
        if (real ==null){
            real = new DBQuery();
        }
        return real.request();
    }
}
