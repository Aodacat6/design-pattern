package com.study.proxy.jdkdynproxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:08
 * @description：客户端，租户
 * @modified By：
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args){
        Host host = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置真实角色
        proxyInvocationHandler.setRent(host);
        //获取动态代理生成的代理类
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        //调用代理方法
        proxy.rent();
    }
}
