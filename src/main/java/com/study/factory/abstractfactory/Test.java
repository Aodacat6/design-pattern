package com.study.factory.abstractfactory;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:24
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.createNoodle().eat();
        factory.createRice().make();
    }
}
