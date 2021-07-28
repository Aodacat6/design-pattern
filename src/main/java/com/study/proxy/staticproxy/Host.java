package com.study.proxy.staticproxy;

/**
 * @author ：songdalin
 * @date ：2021-07-28 下午 04:01
 * @description：实际业务类  房东
 * @modified By：
 * @version: 1.0
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("租房子");
    }
}
