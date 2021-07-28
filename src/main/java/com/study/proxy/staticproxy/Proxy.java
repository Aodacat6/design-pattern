package com.study.proxy.staticproxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:00
 * @description：代理类  中介
 * @modified By：
 * @version: 1.0
 */
public class Proxy implements Rent{

    private Host host;

    //不允许无参数new
    private Proxy(){}

    public Proxy(Host host){
        this.host = host;
    }


    @Override
    public void rent() {
        see();
        /**
         * 调用实际业务的方法
         */
        host.rent();
        sign();
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
