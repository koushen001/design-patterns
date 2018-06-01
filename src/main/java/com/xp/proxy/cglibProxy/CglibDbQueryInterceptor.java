package com.xp.proxy.cglibProxy;

import com.xp.proxy.common.IDBQuery;
import com.xp.proxy.staticProxy.DBQuery;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xiaop on 2018/5/28.
 */
public class CglibDbQueryInterceptor  implements MethodInterceptor {
   IDBQuery real = null;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        if (real ==null)
            real = new DBQuery(); //代理类的内部逻辑和前面jdk的动态代理一样

        return real.request();
    }


    public static IDBQuery createCglidProxy(){
        Enhancer enhancer = new Enhancer();

        enhancer.setCallback(new CglibDbQueryInterceptor()); //指定切入器，定义代理类的逻辑

        enhancer.setInterfaces(new Class[]{IDBQuery.class}); //指定实现的接口

        IDBQuery cglibProxy = (IDBQuery) enhancer.create(); //生成代理类的示例

        return  cglibProxy;
    }
}
