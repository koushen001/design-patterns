package com.cike.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Random;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态创建一个子类对象
 *
 **/
public class ProxyFactory implements MethodInterceptor{
    //目标对象
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类即代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        System.out.println("提交事务");
        return returnValue;
    }
}
