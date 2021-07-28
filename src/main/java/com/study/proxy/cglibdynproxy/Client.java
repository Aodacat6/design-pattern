package com.study.proxy.cglibdynproxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:08
 * @description：客户端，租户
 * @modified By：
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args){

        Host host = new ProxyMethodInterceptor().proxy(new Host());
        host.rent();
    }
}
