package com.study.proxy.cglibdynproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:00
 * @description：代理类  中介   基于CGLIB动态代理
 * @modified By：
 * @version: 1.0
 */
public class ProxyMethodInterceptor implements MethodInterceptor {




    /**
     *
     * 基于CGLIB动态代理
     *
     *
     */



    private Host host;

    public Host proxy(Host host) {
        this.host = host;
        Enhancer enhancer = new Enhancer();   // cglib增强类
        enhancer.setSuperclass(host.getClass()); // 设置目标类
        enhancer.setCallback(this);    // 设置委托对象
        return  (Host) enhancer.create();   // 创建代理对象
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        see();
        Object object = methodProxy.invoke(host, objects);
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
