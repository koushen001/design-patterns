package com.xp.proxy.jdkProxy;

import com.xp.proxy.common.IDBQuery;
import com.xp.proxy.staticProxy.DBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xiaop on 2018/5/26.
 */
public class JdkDbQueryHandler implements InvocationHandler{

    IDBQuery real = null;  //主题接口


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if (real ==null) real = new DBQuery(); //如果是第一次调用，则生成具体的真实对象
        return real.request(); //使用真实的主题完成实际的操作
    }

    public static IDBQuery createJdkProxy(){
        IDBQuery jdkQuery = (IDBQuery)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{IDBQuery.class},
                new JdkDbQueryHandler()); //指定handler
        return jdkQuery;
    }
}
