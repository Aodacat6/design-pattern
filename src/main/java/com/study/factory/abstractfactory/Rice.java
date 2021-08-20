package com.study.factory.abstractfactory;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:21
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Rice implements IRice {
    @Override
    public void make() {
        System.out.println("米饭要蒸");
    }
}
