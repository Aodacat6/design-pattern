package com.study.proxy.jdkdynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:00
 * @description：代理类  中介   基于JDK动态代理
 * @modified By：
 * @version: 1.0
 */
public class ProxyInvocationHandler implements InvocationHandler {




    /**
     *
     * 基于JDK动态代理
     *
     *
     */



    private Rent rent;
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
     * @return
     */
    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(), this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        see();

        //反射
        Object object = method.invoke(rent, args);
        sign();
        return object;
    }


    /**
     * 代理类增强方法
     */
    private void see() {
        System.out.println("看房子");
    }

    /**
     * 代理类增强方法
     * 内部方法
     * 不允许外部调用
     */
    private void sign() {
        System.out.println("签了合约");
    }


}
